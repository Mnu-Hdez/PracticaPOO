file://<HOME>/Library/CloudStorage/OneDrive-UniversidadPolite%CC%81cnicadeMadrid/UNIVERSIDAD/Programacion%20Orientada%20a%20Objetos/Practica_POO_25/src/main/java/model/Player.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.3/scala3-library_3-3.3.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 140
uri: file://<HOME>/Library/CloudStorage/OneDrive-UniversidadPolite%CC%81cnicadeMadrid/UNIVERSIDAD/Programacion%20Orientada%20a%20Objetos/Practica_POO_25/src/main/java/model/Player.java
text:
```scala
package model;
public class Player
{
    private String name;
    private float score;

    public Player()
    {
        this.name = new na@@
    }
}

```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:933)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:168)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.completions.CompletionProvider.completions(CompletionProvider.scala:48)
	scala.meta.internal.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:155)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator