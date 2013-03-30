JCC = javac
SRCDIR = src
BINDIR = bin
LIBSDIR = ".:lib/*:/usr/share/java/gtk-4.1.jar"
JFLAGS = -g -d $(BINDIR) -cp $(LIBSDIR)

all: James.class

James.class: $(SRCDIR)/james/James.java
	$(JCC) $(JFLAGS) $(SRCDIR)/james/James.java

clean:
	$(RM) $(BINDIR)/*.class
