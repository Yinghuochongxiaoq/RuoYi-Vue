@ECHO OFF 

SET dbhost=127.0.0.1 
SET dbuser=root
SET dbpasswd=passwd
SET dbName=ry-vue
SET sqlpath=A:\sql\
set sqlfile=all.sql

cd B:\mysql\bin

::ִ��SQL�ű�
echo ׼��ִ�е�sql�ű��ļ���%sqlpath%%sqlfile%
mysql -h%dbhost% -u%dbuser% -p%dbpasswd% %dbName%< %sqlpath%%sqlfile% --default-character-set=utf8
ECHO OK!
PAUSE

@ECHO Done!