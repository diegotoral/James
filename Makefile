JCC = javac
SRCDIR = src
BINDIR = bin
LIBSDIR = "lib/*"
JFLAGS = -g -d $(BINDIR) -cp $(LIBSDIR)

all: James.class

James.class: $(SRCDIR)/james/James.java
	$(JCC) $(JFLAGS) $(SRCDIR)/james/James.java

clean:
	$(RM) $(BINDIR)/*.class
