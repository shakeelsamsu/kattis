#include <iostream>
#include <string>
#include <unordered_map>

using namespace std;

int main() {
    int n;
    cin >> n;

    string _x;
    getline(cin, _x);

    unordered_map<string, string> affiliation;
    for(int i = 0; i < n; i++) {
        string name;
        string party;
        getline(cin, name);
        getline(cin, party);
        affiliation[name] = party;
    }

    unordered_map<string, int> votes;
    int m;
    cin >> m;
    getline(cin, _x);
    for(int i = 0; i < m; i++) {
        string vote;
        getline(cin, vote);
        votes[vote] = votes[vote] + 1;
    }

    string winner;
    int res = 0;
    bool tie = false;
    for(pair<string, int> entry : votes) {
        if(entry.second == res) tie = true;
        if(entry.second > res) {
            res = entry.second;
            tie = false;
            winner = entry.first;
        }
    }

    cout << (tie ? "tie" : affiliation[winner]) << endl;
}