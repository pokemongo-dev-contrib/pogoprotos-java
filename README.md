# POGOProtos Java
Provides compiled java bindings

Quick build instructions

1. Pull latest POGOProtos
  * `git submodule update --init --recursive`
  * `cd POGOProtos && git pull origin master`
2. Update the version to the latest version number (will be in the tags)
  * modify pom.xml     <version>2.8.0</version>
3. Build project 
  * `mvn install`
  * ---OR---
  * `docker run -it --rm --name my-maven-project  -v "C:\Users\celan\.m2":/root/.m2 -v "F:\PokeBattler\pogoprotos-java":/usr/src/mymaven -w /usr/src/mymaven maven:3.2-jdk-8 mvn clean install`
4. Release snapshot same as above but with deploy, note requires pgp key and OSS Sonatype setup
  * `mvn -DperformRelease=true clean deploy`
* ---OR---
  * `docker run -it --rm --name my-maven-project -v "C:\Users\celan\.gnupg":/root/.gnupg  -v "C:\Users\celan\.m2":/root/.m2 -v "F:\PokeBattler\pogoprotos-java":/usr/src/mymaven -w /usr/src/mymaven maven:3.2-jdk-8 mvn -DperformRelease=true clean deploy`
5. Release project same as above but with deploy, note requires pgp key and OSS Sonatype setup
  * `mvn -DperformRelease=true release:clean release:prepare release:perform`
* ---OR---
  * Create TestVolume share drive, copy ~/.ssh contents into it
  * `docker volume create --opt type=cifs --opt device=//192.168.1.2/TestVolume --opt o=username=USER,password=PASS,file_mode=0700,dir_mode=0700 testvolume7` 
  * `docker run -it --rm --name my-maven-project -v "C:\Users\celan\.gnupg":/root/.gnupg  -v "C:\Users\celan\.m2":/root/.m2  -v "C:\Users\celan\.gitconfig":/root/.gitconfig -v "F:\PokeBattler\pogoprotos-java":/usr/src/mymaven -v testvolume7:/root/.ssh -w /usr/src/mymaven maven:3.2-jdk-8 mvn -DperformRelease=true -Darguments=-DperformRelease=true release:clean release:prepare release:perform`

  
  
