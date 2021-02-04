#!/bin/bash

mediador=true
aplicativo='com.agendeiquadras'


while [ "$mediador" = true ]; do

  date +"%T" |tr '\n' ';'>>memoriaInfo.txt; adb shell dumpsys meminfo com.agendeiquadras | grep TOTAL | awk 'NR==1 {print "Pss:"$2,"Private:"$3}' >> memoriaInfo.txt
  date +"%T" |tr '\n' ';'>>CpuInfo.txt; adb shell dumpsys cpuinfo | grep 'com.agendeiquadras' | awk '{print $1}' >> CpuInfo.txt
#  adb shell dumpsys procstats com.agendeiquadras --clear
#  adb shell dumpsys procstats com.agendeiquadras --current | grep 'TOTAL' | awk 'NR==4' ou tail -1


done