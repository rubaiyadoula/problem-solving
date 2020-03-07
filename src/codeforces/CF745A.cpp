#include <bits/stdc++.h>
using namespace std;

int main() {
	string s;
	cin >> s;
	set<string> setOfString;

	for(int i = 0; i < s.size(); i++) {
		setOfString.insert(s);
		s = s[s.length() - 1] +
			s.substr(0, s.length() - 1);
	}

	cout << setOfString.size() << endl;

	return 0;
}