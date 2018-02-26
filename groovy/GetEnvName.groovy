def hostDir = "/root/build/ansible-ci/hosts"
def newList = []
lineList = new File(hostDir).readLines();
lineList.each {
	(it =~ /\[.+\]/).each{ match ->
		//去掉组变量定义
		if(match.contains(":vars")==false){
			newList += match.replaceAll(/\[/,'').replaceAll(/\]/,'')
		}
	}
}
newList.unique().each{ println "${it}" }