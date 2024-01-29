#include <iostream>
#include <map>

using namespace std;

int main() {
    int N, P, W, L, G;
    cin >> N >> P;
    cin >> W >> L >> G;

    // 해킹한 플레이어 이름과 승점을 저장할 맵
    map<string, int> playerScores;

    // 플레이어 정보 (이름, W, L) 입력
    for (int i = 0; i < P; i++) {
        string name, result;
        cin >> name >> result;

        if (result == "W") {
            playerScores[name] = W;
        } else {
            playerScores[name] = -L;
        }
    }

    int score = 0;

    // N번째 게임까지 진행
    for (int i = 0; i < N; i++) {
        string name;
        cin >> name;
        
        // 명단에 없는 이름
        if (playerScores.find(name) == playerScores.end()) {
            score -= L;
        } else {
            score += playerScores[name];
        }

        // 형동이의 점수가 G를 넘으면 게임 종료
        if (score >= G) {
            break;
        }

        // 형동이의 점수가 음수면 0으로 초기화
        if (score < 0) {
            score = 0;
        }
    }

    // 아이언 티어에서 벗어났는지 확인하여 출력
    if (score >= G) {
        cout << "I AM NOT IRONMAN!!" << endl;
    } else {
        cout << "I AM IRONMAN!!" << endl;
    }

    return 0;
}
