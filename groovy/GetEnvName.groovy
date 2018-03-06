def hostDir = "/root/build/ansible-ci/hosts"
def newList = []
lineList = new File(hostDir).readLines();
lineList.each {
	(it =~ /\[.+\]/).each{ match ->
		//去掉组变量定义和生产环境配置
		if(!match.contains(":vars")&&!match.contains("web_prod_real")){
			newList += match.replaceAll(/\[/,'').replaceAll(/\]/,'')
		}
	}
}
newList.unique().each{ println "${it}" }