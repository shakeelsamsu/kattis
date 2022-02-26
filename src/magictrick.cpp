#include <iostream>
#include <unordered_set>

using namespace std;

int main() {
    string s;
    cin >> s;
    unordered_set<char> set = unordered_set<char>();
    for(auto c : s) {
        set.insert(c);
    }
    cout << (set.size() == s.length()) << endl; 

}
