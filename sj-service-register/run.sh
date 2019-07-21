#!/usr/bin/env bash
ps ax |grep  syt_register | awk '{print $1}' |xargs kill -9

nohup java -Dappname=syt_register -server -Xms1g -Xmx1g -Dorg.terracotta.quartz.skipUpdateCheck=true -XX:+UseParNewGC -XX:SurvivorRatio=3 -XX:NewRatio=3 -XX:+DoEscapeAnalysis -XX:+UseConcMarkSweepGC -XX:CMSMaxAbortablePrecleanTime=5000 -XX:+CMSClassUnloadingEnabled -XX:+UseCMSInitiatingOccupancyOnly -XX:CMSInitiatingOccupancyFraction=80 -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/mw/log/syt/syt.hprof -jar /mw/code/sythhyy/sj-service-register/target/sj-service-register-0.0.1-SNAPSHOT.jar &