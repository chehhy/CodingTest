

// 거리두기 확인하기
public class pr81302 {
	
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];

        for(int t=0; t<places.length; t++) {
            String[] map = places[t];
            boolean flag = false; // 거리두기가 지켜졌는지 아닌지를 나타냄
            
            // 5x5 칸을 하나하나 돌면서 사람이 있는 칸일 때 거리두기가 지켜졌는지 확인
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (map[i].charAt(j)=='P') { // 이 칸에 사람이 있을 때
                        if (isAroundExistPerson(i, j, map)) { // isAroundExistPerson 에서 거리두기 확인
                            flag = true; // 거리두기 안지킨 칸이 있으면 break
                            break;
                        }
                    }
                }
                if(flag){
                    answer[t] = 0;
                    break;
                }
            }
            if(!flag){
                answer[t] = 1;
            }
        }

        return answer;
    }

     public static boolean isAroundExistPerson(int i, int j, String[] map){

        // 상하좌우 확인 (P가 상하좌우로 인접해 있으면 거리두기 실패)
        int[] mi = {0, 0, 1, -1};
        int[] mj = {1, -1, 0, 0};
        
        // mi, mj를 이용해 상,하,좌,우로 1씩 움직이면서 사람이 있는지 확인
        for (int d = 0; d < 4; d++) {
            int ni = i + mi[d];
            int nj = j + mj[d];
            if(ni<0 || ni>=5 || nj<0 || nj>=5) continue; // 확인하려는 칸이 5x5를 넘어가면 continue
            if(map[ni].charAt(nj)=='P') // 사람이 있다면 거리두기 실패
            	return true; 
        }
        
        // 상하좌우 맨하탄 거리 2 확인 (파티션 없이 맨하탄 거리가 2 이하면 거리두기 실패)
        int[] mi2 = {0, 0, 2, -2};
        int[] mj2 = {2, -2, 0, 0};
        
        // mi2, mj2를 이용해 상,하,좌,우로 2씩 움직이면서 사람이 있는지 확인
        for (int d = 0; d < 4; d++) {
            int ni = i + mi2[d];
            int nj = j + mj2[d];
            if(ni<0 || ni>=5 || nj<0 || nj>=5) continue; // 확인하려는 칸이 5x5를 넘어가면 continue
            if(map[ni].charAt(nj)=='P') { // 사람이 있고, P와 P 사이에 파티션이 없다면 거리두기 실패
                if(map[(i+ni)/2].charAt((j+nj)/2)!='X'){
                    return true;
                }
            }
        }

        // 대각선 확인 (P가 대각선으로 인접해 있을 때, 사이에 파티션이 없으면 거리두기 실패) 
        int[] mi3 = {1, 1, -1, -1};
        int[] mj3 = {1, -1, 1, -1};

        // mi3, mj3를 이용해 대각선으로 움직이면서 사람이 있는지 확인
        for (int d = 0; d < 4; d++) {
            int ni = i + mi3[d];
            int nj = j + mj3[d];
            if(ni<0 || ni>=5 || nj<0 || nj>=5) continue; // 확인하려는 칸이 5x5를 넘어가면 continue
            if(map[ni].charAt(nj)=='P') { // 사람이 있고, 사이에 파티션이 하나라도 없으면 거리두기 실패 
                if(!(map[i].charAt(nj)=='X' && map[ni].charAt(j)=='X')){
                    return true;
                }
            }
        }

        return false;
    }
}
