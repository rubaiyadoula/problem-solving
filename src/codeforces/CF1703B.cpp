#include <bits/stdc++.h>
#include <cmath>
using namespace std;

int main() {
	int n;
	scanf("%d", &n);
	while(n--) {
		int t;
		cin >> t;
		set<char> st;
		int cnt = 0;
		while (t--) {
			char p;
			cin >> p;
			if (st.find(p) != st.end()) {
				cnt++;
			} else {
				st.insert(p);
				cnt += 2;
			}
		}
		cout << cnt << endl;
	}
}