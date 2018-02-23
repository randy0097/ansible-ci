def hostDir = "/root/build/ansible-ci/hosts"
def newList = []
lineList = new File(hostDir).readLines();
lineList.each {
	(it =~ /\[.+\]/).each{ match ->
		newList += match.replaceAll(/\[/,'').replaceAll(/\]/,'')
	}
}
newList.unique().each{ println "${it}" }