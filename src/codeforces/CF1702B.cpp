#include <bits/stdc++.h>
#include <cmath>
using namespace std;

int main() {
	int n;
	scanf("%d", &n);
	while(n--) {
		string s;
		cin >> s;
		int sLen = s.length();
		int days = 0;
		set<char> st;
		
		for(int i = 0; i < sLen; i++) {
			st.insert(s.at(i));
			if(st.size() > 3) {
				st.clear();
				days++;
				st.insert(s.at(i));
			}
		}
		if (st.size() > 0) days++;
		cout << days << endl;
	}
}