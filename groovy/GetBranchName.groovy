// if (this.args.size() !=1 )  {
// 	throw new IllegalArgumentException('this script expects exactly one arguments')
// }

// def gitUrl = ''
// def frontGitUrl = 'git@192.168.194.114:iscloud-frontend/iscloud-web.git'
// def backGitUrl = 'git@192.168.194.114:iscloud-backend/iscloud.git'
// if(this.args[0] == 'frontend') {
// 	gitUrl = frontGitUrl
// }else if(this.args[0] == 'backend') {
// 	gitUrl = backGitUrl
// }else {
// 	throw new IllegalArgumentException('argument value is wrong')
// }

def gitUrl = 'git@192.168.194.114:iscloud-frontend/iscloud-web.git'

def newList = []
def branches = ("git ls-remote -h $gitUrl").execute()
branches.text.readLines().each{
	def branch = it.split()[1].replaceAll('refs/heads/', '')
	//	if(branch.contains("master")) {
	newList += branch
	//	}
}
newList.unique().each{ println "${it}" }