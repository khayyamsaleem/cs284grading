# cs284grading
grading scripts for cs284 s2017

to run, set up directory like:

grading
<ul> 
<li> hw1
<ul>
<li>grade.py</li>
<li>TestScript.java</li>
<li>submissions.zip</li>
</ul>
</li>
<li> hw2 </li>
<ul><li>same as hw1</li></ul>
<li> etc ... </li>
</ul>
    
TestScript.java will be different for each hw

grade.py can be modified to only apply your grading script to your students

grade.py can be run with:

./grade.py

inside "grading" directory, after grader performs 

chmod +x grade.py

Output for all files is logged in final.txt in grading. Individual output is in

toGrade/<studentname>/output.txt

When done, optionally remove all garbage with:

rm -r final.txt toGrade submissions

When contributing, make changes in your own branch and I'll merge into master upon request.
