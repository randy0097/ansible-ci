def hostDir = "/root/build/ultra-permission/iscloud-ci/hosts"
def newList = []
lineList = new File(hostDir).readLines();
lineList.each {
	(it =~ /\[.+\]/).each{ match ->
		//去掉组变量定义和生产环境配置
		if(match.contains("real_prod_security_91_92")){
			newList += match.replaceAll(/\[/,'').replaceAll(/\]/,'')
		}
	}
}
newList.unique().each{ println "${it}" }