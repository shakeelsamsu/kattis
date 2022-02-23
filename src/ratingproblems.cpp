#include <iostream>

using namespace std;

int main() {
    int n, k; 
    cin >> n >> k;
    int m = n - k;
    int score = 0;
    while(k-- > 0) {
        int x;
        cin >> x;
        score += x;
    }
    cout << (float) (score + m * -3) / n << " " << (float) (score + 3 * m) / n << endl;
}
