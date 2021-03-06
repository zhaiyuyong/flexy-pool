<img src="https://raw.githubusercontent.com/wiki/vladmihalcea/flexy-pool/image/FlexyPoolLogo.jpg" alt="Flexy Pool Logo" height="196">

### Introduction

The FlexyPool library adds metrics and flexible strategies to a given Connection Pool, allowing it to resize on demand.
This is very handy since most connection pools offer a limited set of dynamic configuration strategies.

![alt text](https://raw.githubusercontent.com/wiki/vladmihalcea/flexy-pool/image/architecture/FlexyPoolArchitecture.gif  "Flexy Pool Architecture")

### Features 

* multiple environment options
 * Stand-alone (Spring, Guice)
 * Java EE
* extensive connection pool support
 * [Bitronix Transaction Manager](https://github.com/bitronix/btm)
 * [Apache DBCP](http://commons.apache.org/proper/commons-dbcp/)
 * [Apache DBCP2](http://commons.apache.org/proper/commons-dbcp/)
 * [C3P0](http://www.mchange.com/projects/c3p0/)
 * [BoneCP](http://jolbox.com/)
 * [HikariCP](http://brettwooldridge.github.io/HikariCP/)
 * [Tomcat CP](http://tomcat.apache.org/tomcat-7.0-doc/jdbc-pool.html)
* statistics support
 * concurrent connections histogram
 * concurrent connection requests histogram
 * data source connection acquiring time histogram
 * connection lease time histogram
 * maximum pool size histogram
 * total connection acquiring time histogram
 * overflow pool size histogram
 * retries attempts histogram

### Documentation 

1. [Installation Guide](https://github.com/vladmihalcea/flexy-pool/wiki/Installation-Guide)
2. [User Guide](https://github.com/vladmihalcea/flexy-pool/wiki/User-Guide)

### In the Press

1. [The anatomy of Connection Pooling](http://vladmihalcea.com/2014/04/17/the-anatomy-of-connection-pooling)
2. [FlexyPool, reactive connection pooling](http://vladmihalcea.com/2014/04/25/flexy-pool-reactive-connection-pooling)
3. [Professional connection pool sizing](http://vladmihalcea.com/2014/04/30/professional-connection-pool-sizing)
4. [The simple scalability equation](http://vladmihalcea.com/2014/05/20/the-simple-scalability-equation)

### Who uses FlexyPool

<a href="http://www.etuovi.com/"><img src="http://avain.etuovi.com/media/layout/images/etuovi-logo.gif"/></a> is the leading real estate portal in Finland.

> New Etuovi.com has used FlexyPool in production since early 2014. 
> The library has proven to be reliable and allows our infrastructure to handle temporary spikes much better. 
> We use it everywhere in our stack, ranging from our frontends to the backend services.
>
> -- <cite>Antti Koivisto, Software Architect, Etuovi.com</cite>

### Requirements

* Java 1.6 and above for all modules but the *flexy-dbcp2* which requires at least Java 1.7
* SLF4J 1.7.6
