#include <iostream>
#include <algorithm> 
// sort 함수를 사용하기 위한 헤더
using namespace std;

int main() {
    int cat, K; 
    cin >> cat >> K;

    int arr[cat]; // 고양이 무게 배열 입력
    for (int i = 0; i < cat; i++) {
        cin >> arr[i];
    }

    // 무게 오름차순 정렬
    sort(arr, arr + cat);
		//투 포인터
		int left = 0;
    int right = cat - 1;
    int count = 0;

    while (left < right) {
        if (arr[left] + arr[right] <= K) {
            left++;
            right--;  // right를 감소
            count++;
        } else {
            right--;  // 합이 K를 넘으면 right만 감소
        }
    }
    cout << count << endl;
    return 0;
}