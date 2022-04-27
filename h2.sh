#!/bin/sh
java -cp h2-2.1.210.jar org.h2.tools.Server -tcp -tcpAllowOthers -ifNotExists -web
