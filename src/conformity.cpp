#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
#include <unordered_map>

using namespace std;

int main() {
    int n;
    cin >> n;
    
    unordered_map<string, int> map;
    for(int i = 0; i < n; i++) {
        vector<string> s;
        for(int j = 0; j < 5; j++) {
            string x;
            cin >> x;
            s.push_back(x);
        }
        // sort(s.begin(), s.end());
        sort(s.begin(), s.end());
        string k;
        for(string x : s)
            k += x;
        map[k] = map[k] + 1;
    }

    int res = 0;
    int _max = 0;
    for(pair<string, int> entry : map) {
        // cout << entry.second << " " << _max << " " << res << endl;
        if(entry.second == _max) res += entry.second;
        else if(entry.second > _max) {
            _max = max(_max, entry.second);
            res = entry.second;
        }
    }

    cout << res << endl;

    return 0;
}