#include <iostream>
#include <string>
#include <unordered_map>

using namespace std;

int main() {
    int m, n;

    cin >> m >> n;
    unordered_map<string, int> dict;
    for(int i = 0; i < m; i++) {
        string s;
        int v;
        cin >> s >> v;
        dict[s] = v;
    }

    for(int i = 0; i < n; i++) {
        int res = 0;
        while(true) {
            string s;
            cin >> s;
            if(s.compare(".") == 0) {
                break;
            }
            res += dict[s];
        }
        cout << res << endl;
    }

    return 0;
}