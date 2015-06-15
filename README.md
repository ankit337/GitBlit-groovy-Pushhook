# GitBlit-groovy-Pushhook
GitBlit groovy hook which push changed to other Gitblit server repo

* copy above `pushhook.groovy` under `groovy folder` which found under your gitblit installation directory (eg: `/root/softwares/apache-tomcat-6.0.32/webapps/gitblit/WEB-INF/data/groovy`)
* Open Gitblit web interface
* click on repository tab > select your repository 
* Edit your repository >  select receive tab
* On receive tab you can find `post-receive scripts` section
* Under `post-receive scripts` you can find your added `pushhook.groovy` 
* select it as it shown under selected and save it
* restart your server
* now commit any change to your repository, your `pushhook` will fire and will copy your changes to target repository
