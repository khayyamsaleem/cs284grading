#!/usr/bin/env python

import commands
import functools
from prettyprint import pp
import os

def lcs(data):
    substr = ''
    if len(data) > 1 and len(data[0]) > 0:
        for i in range(len(data[0])):
            for j in range(len(data[0])-i+1):
                if j > len(substr) and all(data[0][i:i+j] in x for x in data):
                    substr = data[0][i:i+j]
    return substr

commands.getoutput('unzip submissions*.zip -d submissions')

my = commands.getoutput("ls submissions/*.java | cut -c13-").split('\n')
fname = lcs(my)[1:]
 
commands.getoutput('mkdir toGrade')
prog = "ls submissions/*.java | cut -c13- | sed 's/_.*//' $1 | while read x; do mkdir toGrade/$x; mv submissions/$x*.java toGrade/$x/" + fname + ".java; cp TestScript.java toGrade/$x/; sed -i '' '/^package/d' toGrade/$x/" + fname + ".java; javac toGrade/$x/*.java; cd toGrade/$x/; java TestScript >> output.txt; cd ../../; echo $x >> final.txt; echo >> final.txt; cat toGrade/$x/output.txt >> final.txt; echo >> final.txt; done"

commands.getoutput(prog) 
