def frontGitUrl = 'git@192.168.194.114:whdev-frontend/ultra-permission-frontend.git'
def backGitUrl = 'git@192.168.194.114:whdev-backend/ultra-permission.git'
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