package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Random anyNum = new Random();
		List<Integer> numList=new ArrayList<>(1000);
		for (int i = 0; i < 1000; i++) {
			numList.add(anyNum.nextInt(1000));
		}
		long seqStartTime=System.currentTimeMillis();
		int biggieSequence = numList.stream().reduce(0, (result,current)->result>current ? result:current);
		long seqEntTime=System.currentTimeMillis();
		long totalTimeseq= seqEntTime-seqStartTime;
		long parallelStartTime = System.currentTimeMillis();
		int biggieParallel=numList.parallelStream().reduce(0, (result,current)->result>current ? result : current,Integer::max);
		long parallelEndTime=System.currentTimeMillis();
		long totalTimeParallel = parallelEndTime-parallelStartTime;
		System.out.println("Biggest by sequential : " + biggieSequence + " time taken : " + totalTimeseq);
		System.out.println("Biggest by parallel : " + biggieParallel + " time taken: " + totalTimeParallel);
		
	}

}
