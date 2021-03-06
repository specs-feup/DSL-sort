package pipesgraph;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Display extends Sink{

private int[] display_in1;
public int[] getdisplay_in1() {return display_in1;};
public void setdisplay_in1(int[] val) {display_in1 = val;};
private long display_in2;
public long getdisplay_in2() {return display_in2;};
public void setdisplay_in2(long val) {display_in2 = val;};
	public Display(String name){
	this.name=name;
	switch (name) {
	case "sink2":
	call = () -> {
		System.out.println("Time of Java lib: " + display_in2);
		};
	break;
	case "sink3":
	call = () -> {
		System.out.println("Time of other algorithm: " + display_in2);
		};
	break;
	default:
	call = () -> {System.out.println("Sort: ");
		for(int i = 0; i<display_in1.length;i++)
			System.out.println(display_in1[i]);
		System.out.println("Average: " + display_in2);};
	break;	
	}
	switch (name) {
	case "sink1":
	assign = () -> {
		display_in2 = ((Avg)graph.getComponent("avg1")).getavg_out1();
		display_in1 = ((Sort)graph.getComponent("sort1")).getsort_out1();
	};
	break;
	case "sink2":
	assign = () -> {
		display_in2 = ((Sort)graph.getComponent("sort1")).getsort_out2();
	};
	break;
	case "sink3":
	assign = () -> {
		display_in2 = ((Sort)graph.getComponent("sort2")).getsort_out2();
	};
	break;
	default:
	assign = () -> {};
	break;					
	}

}

}
