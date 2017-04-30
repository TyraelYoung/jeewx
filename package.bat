echo 'Start to build project'
@echo off

cd jeecg-p3-biz-alipay-single
call mvn install package -Dmaven.test.skip=true

cd ..\jeecg-p3-biz-qywx
call mvn install package -Dmaven.test.skip=true

cd ..\libjava
call mvn install package -Dmaven.test.skip=true

cd ..\xwikiclient
call mvn install package -Dmaven.test.skip=true

cd ..\jeewx
call mvn install package -Dmaven.test.skip=true

@echo on
echo 'Build project successfully!'

pause