APP_BIN_PATH=''
x=`echo $0 | grep "^/"`
if test "${x}"; then
        APP_BIN_PATH=`dirname $0`
else
        PWD=`pwd`
        APP_BIN_PATH=`dirname $PWD/$0`
fi
APP_HOME=$APP_BIN_PATH/..
APP_LIB_PATH=$APP_HOME/lib
APP_CLASSPATH="."
for filename in `ls $APP_LIB_PATH/*.jar`
do 
    APP_CLASSPATH=$APP_CLASSPATH:$filename
done
APP_CLASSPATH=$APP_CLASSPATH:$APP_HOME/classes

PARAMS=$1' '$2
EXEC='java -Djava.util.logging.config.file='$APP_HOME'/classes/logging.properties -Dfile.encoding=UTF-8 -classpath '$APP_CLASSPATH' '$PARAMS
exec $EXEC