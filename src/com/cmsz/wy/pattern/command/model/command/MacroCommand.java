package com.cmsz.wy.pattern.command.model.command;

import java.util.Iterator;
import java.util.Stack;

public class MacroCommand implements Command{
	private Stack commands = new Stack();

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		Iterator it = commands.iterator();
		while(it.hasNext()){
			((Command)it.next()).execute();
		}
	}
	
	public void append(Command cmd){
		if(cmd != this){
			commands.push(cmd);
		}
	}
	
	public void undo(){
		if(!commands.empty()){
			commands.pop();
		}
	}
	
	public void clear(){
		commands.clear();
	}

}
