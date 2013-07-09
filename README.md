# Gradle Java Plugin Experiment

## Environment

* Ubuntu Server amd64 12.04
* Java (Oracle JDK 1.6.0)
* GVM 1.2.1
* Gradle 1.6

### How to setup

#### JRE and JDK

* [https://github.com/kaosf/ubuntu-setup/blob/52d2725185a749ce5e314db535901a6da0aeb5ec/setup.sh#L104-107](https://github.com/kaosf/ubuntu-setup/blob/52d2725185a749ce5e314db535901a6da0aeb5ec/setup.sh#L104-107)
* [Ubuntu 12.04 に Oracle Java 6, 7 (JRE, JDK) をインストール - Qiita](http://qiita.com/ka_/items/dbeca6fac63a6e8ec9a6)

#### GVM and Gradle

* [https://github.com/kaosf/ubuntu-setup/blob/52d2725185a749ce5e314db535901a6da0aeb5ec/gradle-setup.sh](https://github.com/kaosf/ubuntu-setup/blob/52d2725185a749ce5e314db535901a6da0aeb5ec/gradle-setup.sh)

## "adder" directory

A simple project for generating `adder.jar`.

Run `gradle test` for test.

Run `gradle jar` for generating a jar file.

## References

### Gradle

* [Gradle入門 #gradle - Qiita [キータ]](http://qiita.com/vvakame/items/83366fbfa47562fafbf4)
* [Chapter&nbsp;23.&nbsp;The Java Plugin](http://www.gradle.org/docs/current/userguide/java_plugin.html)
* [Gradle User Guide (日本語)](http://gradle.monochromeroad.com/docs/userguide/java_plugin.html)
* [第23章 Javaプラグイン](http://gradle.monochromeroad.com/docs/userguide/java_plugin.html)
* [javaのビルドをgradleで行う：実践編5：マルチプロジェクト時のprovidedCompileについて - treeのメモ帳](http://treeapps.hatenablog.com/entry/2013/06/19/010640)

### Apache HTTPComponents

* [Apache HttpComponents - HttpComponents Downloads](http://hc.apache.org/downloads.cgi)
* [javaのHttpClientでファイルをダウンロード(proxy経由とBASIC認証付き) | Pa-kun plus idea](http://web.plus-idea.net/2012/04/java-httpclient-proxy-basic/)

### Jar file

* [Using Gradle to build a jar with dependencies - Stack Overflow](http://stackoverflow.com/questions/4871656/using-gradle-to-build-a-jar-with-dependencies)
* [Javaの道：基本事項（５．クラスパス）](http://www.javaroad.jp/java_basic2.htm)
* [Java/jarファイルの配布と実行方式 - Glamenv-Septzen.net](http://www.glamenv-septzen.net/view/1121)
* [Jarファイルメモ(Hishidama's java-archive Memo)](http://www.ne.jp/asahi/hishidama/home/tech/java/jar.html)
