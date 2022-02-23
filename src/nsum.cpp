#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;
    int res = 0;
    while(n-- > 0) {
        int x;
        cin >> x;
        res += x;
    }
    cout << res << endl;
}
