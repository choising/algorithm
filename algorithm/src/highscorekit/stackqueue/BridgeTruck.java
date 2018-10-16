package highscorekit.stackqueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class BridgeTruck {
    public int time;
	public int weight;
	
	public BridgeTruck(int weight) {
		this.time = 1;
		this.weight = weight; 
	}

    public static int weightSum(List<BridgeTruck> list) {
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i).weight;
		}
		return sum;
	}
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 1;
        Queue<Integer> truckQ = new LinkedList<>();
        Queue<BridgeTruck> endTruckQ = new LinkedList<>();
        List<BridgeTruck> bridgeList = new ArrayList<>();
        for(int truck : truck_weights) {
        	truckQ.add(truck);
        }
        bridgeList.add(new BridgeTruck(truckQ.poll()));
        
        while(endTruckQ.size() != truck_weights.length) {
        	if(bridgeList.get(0).time == bridge_length) {
        		endTruckQ.add(bridgeList.remove(0));
        	}
    		for(BridgeTruck truck : bridgeList) {
    			truck.time++;
    		}
    		if(!truckQ.isEmpty() && weightSum(bridgeList) + truckQ.peek() <= weight) {
    	        bridgeList.add(new BridgeTruck(truckQ.poll()));
    		}
        	answer++;
        }
        return answer;
    }
}

