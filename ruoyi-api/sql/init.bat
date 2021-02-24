@ECHO OFF 

SET dbhost=127.0.0.1 
SET dbuser=root
SET dbpasswd=passwd
SET dbName=ry-vue
SET sqlpath=A:\sql\
set sqlfile=all.sql

cd B:\mysql\bin

::执行SQL脚本
echo 准备执行的sql脚本文件：%sqlpath%%sqlfile%
mysql -h%dbhost% -u%dbuser% -p%dbpasswd% %dbName%< %sqlpath%%sqlfile% --default-character-set=utf8
ECHO OK!
PAUSE

@ECHO Done!