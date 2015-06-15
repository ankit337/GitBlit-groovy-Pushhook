import com.gitblit.GitBlit
import com.gitblit.Keys
import com.gitblit.models.RepositoryModel
import com.gitblit.models.TeamModel
import com.gitblit.models.UserModel
import com.gitblit.utils.JGitUtils
import com.gitblit.utils.StringUtils
import java.text.SimpleDateFormat
import org.eclipse.jgit.api.CloneCommand
import org.eclipse.jgit.api.Git
import org.eclipse.jgit.lib.Repository
import org.eclipse.jgit.lib.Config
import org.eclipse.jgit.revwalk.RevCommit
import org.eclipse.jgit.transport.ReceiveCommand
import org.eclipse.jgit.transport.ReceiveCommand.Result
import org.eclipse.jgit.util.FileUtils
import org.eclipse.jgit.util.FS
import org.slf4j.Logger


logger.info("*************** START CUSTOM PUSH *******************")

File baseFolder = new File("/root/softwares/apache-tomcat-6.0.32/webapps/gitblit/WEB-INF/data/git");
File repoFolder = new File(baseFolder, repository.name);
Git git = Git.open(repoFolder, FS.detect())
git.push().setRemote("ssh://admin@111.11.111.111:29418/testrepo.git").setPushAll().call();


logger.info("*************** DONE CUSTOM PUSH*******************")
