package cn.aofeng.demo.script;

import java.util.HashMap;
import java.util.Map;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 多个脚本引擎执行JavaScript的性能比较。
 * 
 * @author <a href="mailto:aofengblog@163.com">聂勇</a>
 */
public class MultiScriptEngineCompare {

    /**
     * 获取指定的脚本引擎执行指定的脚本。
     * 
     * @param scriptEngineName 脚本引擎名称
     * @param script 脚本
     * @param count 脚本的执行次数
     * @param vars 绑定到脚本的变量集合
     * @throws ScriptException 执行脚本出错
     */
    public void execute(String scriptEngineName, String script, int count, 
            Map<String, Object> vars) throws ScriptException {
        ScriptEngine scriptEngine = getScriptEngine(scriptEngineName);
        System.out.println( String.format("脚本引擎：%s", scriptEngine.getFactory().getEngineName()) );
        System.out.println( String.format("脚本：%s", script) );
        System.out.println( String.format("脚本绑定参数：%s", vars) );
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            runSingleScript(script, vars, scriptEngine);
        }
        long usedTime = System.currentTimeMillis() - startTime;
        System.out.println( String.format("脚本执行%d次，消耗%d毫秒。", count, usedTime) );
        System.out.println("");
    }
    
    private void runSingleScript(String script, Map<String, Object> vars, ScriptEngine scriptEngine) throws ScriptException {
        if (null == vars || vars.isEmpty()) {
            scriptEngine.eval(script);
        } else {
            Bindings binds = createBinding(scriptEngine, vars);
            scriptEngine.eval(script, binds);
        }
    }
    
    /**
     * 根据名称获取脚本引擎。
     *  
     * @param name 脚本引擎名称
     * @return 实现了{@link ScriptEngine}的脚本引擎。如果没有对应的脚本引擎，返回null。
     */
    public ScriptEngine getScriptEngine(String name) {
        ScriptEngineManager sem = new ScriptEngineManager();
        return sem.getEngineByName(name);
    }
    
    private Bindings createBinding(ScriptEngine scriptEngine, Map<String, Object> vars) {
        Bindings binds = scriptEngine.createBindings();
        if (null != vars && !vars.isEmpty()) {
            binds.putAll(vars);
        }
        
        return binds;
    }
    
    /**
     * @param args 执行次数
     * @throws ScriptException 
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) throws ScriptException {
        if ( args.length != 1) {
            System.err.println("参数错误。使用示例：\n    java cn.aofeng.demo.script.MultiScriptEngineCompare 100000");
            System.exit(-1);
        }
        int count = Integer.parseInt(args[0]);
        
        String[] scriptEngineList = {"JavaScript", "JEXL"};
        
        String script1 = "var c = a + b;" +
                "var d = a * b;" +
                "var e = a / b;" +
                "var f = a % b;" +
                "var g = a - b;" +
                "var result = ((a * 5) > b || b * 10 >= 100) && (a * b > 99);";
        Map<String, Object> vars1 = new HashMap<String, Object>(2);
        vars1.put("a", 20);
        vars1.put("b", 9);
        
        String script2 = "var result = src.indexOf(b);";
        Map<String, Object> vars2 = new HashMap<String, Object>(2);
        vars2.put("src", "compare performance javascript and jexl");
        vars2.put("b", "script");
        
        String[] scriptList = {script1, script2};
        Map[] varsList = {vars1, vars2};
        
        MultiScriptEngineCompare msec = new MultiScriptEngineCompare();
        for (int i = 0; i < scriptEngineList.length; i++) {
            for (int j = 0; j < scriptList.length; j++) {
                msec.execute(scriptEngineList[i], scriptList[j], count, varsList[j]);
            }
        }
    }

}
