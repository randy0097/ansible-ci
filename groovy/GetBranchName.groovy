def frontGitUrl = 'git@github.com:randy0098/front-test.git'
def backGitUrl = 'git@github.com:randy0098/backend-test.git'
def gitUrl = frontGitUrl

def newList = []
def branches = ("git ls-remote -h $gitUrl").execute()
branches.text.readLines().each{
	def branch = it.split()[1].replaceAll('refs/heads/', '')
	// if(branch=="develop" || branch=="master" || branch.contains("release")) {
		newList += branch
	// }
}
newList.unique().each{ println "${it}" }