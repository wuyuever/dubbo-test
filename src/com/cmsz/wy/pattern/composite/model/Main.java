package com.cmsz.wy.pattern.composite.model;

public class Main {

	public static void main(String[] args) {
		try{
			System.out.println("Marking root entries...");
			Directory rootdir = new Directory("root");
			Directory bindir = new Directory("bin");
			Directory tmpdir = new Directory("tmp");
			Directory usrdir = new Directory("usr");
			rootdir.add(bindir);
			rootdir.add(tmpdir);
			rootdir.add(usrdir);
			bindir.add(new File("vi", 10000));
			bindir.add(new File("latex", 20000));
			rootdir.printList();
			
			System.out.println("");
			System.out.println("Marking user entires...");
			Directory yuki = new Directory("yuki");
			Directory hanako = new Directory("hanako");
			Directory tomura = new Directory("tomura");
			File file = new File("wuyu.txt", 350);
			usrdir.add(yuki);
			usrdir.add(hanako);
			usrdir.add(tomura);
			yuki.add(new File("diary.html", 100));
			yuki.add(new File("Composite.java", 200));
			hanako.add(new File("memo.tex", 300));
			tomura.add(new File("game.doc", 400));
			tomura.add(new File("junk.mail", 500));
			tomura.add(file);
			rootdir.printList();
			
			System.out.println(yuki.getFullName());
			System.out.println(file.getFullName());
			
		}catch(FileTreatmentException e){
			e.printStackTrace();
		}
	}

}
