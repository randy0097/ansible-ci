def hostDir = "/root/build/ultra-license/ansible-ci/hosts"
def newList = []
lineList = new File(hostDir).readLines();
lineList.each {
	(it =~ /\[.+\]/).each{ match ->
		//去掉组变量定义和生产环境配置
		if(!match.contains(":vars")&&!match.contains("pre_prod")&&!match.contains("real_prod")){
			newList += match.replaceAll(/\[/,'').replaceAll(/\]/,'')
		}
	}
}
newList.unique().each{ println "${it}" }