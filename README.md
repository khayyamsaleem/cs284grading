# cs284grading
grading scripts for cs284 s2017

to run, set up directory like:

<li><code>grading</code></li>
<ul> 
<li> <code>hw1</code>
<ul>
<li><code>grade.py</code></li>
<li><code>TestScript.java</code></li>
<li><code>submissions.zip</code></li>
</ul>
</li>
<li><code>hw2</code></li>
<ul><li>same as hw1</li></ul>
<li><code>etc ...</code></li>
</ul>
    
<code>TestScript.java</code> will be different for each hw

<code>grade.py</code> can be modified to only apply your grading script to your students

<code>grade.py<code> can be run with:

<code>./grade.py</code>

inside <code>grading</code> directory, after grader performs 

<code>chmod +x grade.py</code>

Output for all files is logged in <code>final.txt<code> in <code>grading</code>. Individual output is in <code>toGrade/studentname/output.txt</code>

When done, optionally remove all garbage with:

<code>rm -r final.txt toGrade submissions</code>

When contributing, make changes in your own branch and I'll merge into master upon request.
