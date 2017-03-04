# pogoprotos-java
Provides compiled java bindings from https://github.com/AeonLucid/POGOProtos/tree/master

Quick build instructions

1. Pull latest POGOProtos
* git fetch POGOProtos master
* git subtree pull --prefix .vim/bundle/POGOProtos POGOProtos master
Note: if the above does not work, try:
* git remote add -f POGOProtos https://github.com/AeonLucid/POGOProtos.git
* git subtree add --prefix POGOProtos POGOProtos master
1. Build project (requires maven and java installed and in your PATH environment variable)
* mvn install

