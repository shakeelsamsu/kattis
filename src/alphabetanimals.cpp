#include <iostream>
#include <unordered_map>
#include <vector>

using namespace std;

int main() {
    string s;
    int n;

    cin >> s >> n;
    unordered_map<char, vector<string>> map {};

    for(int i = 0; i  < n; ++i) {
        string x;
        cin >> x;
        map.emplace(x.at(0), vector<string> {});
        map[x.at(0)].push_back(x);
    }

    char c = s.at(s.length() - 1);
    if(map.find(c) == map.end()) {
        cout << "?" << endl;
    }
    else {
        vector<string> possible = map[c];
        for(string t : possible) {
            char e = t.at(t.length() - 1);
            if(map.find(e) == map.end() || (e == c && possible.size() == 1)) {
                cout << t << "!" << endl;
                return 0;
            }
        }
        cout << possible[0] << endl;
    }
    return 0;
}
