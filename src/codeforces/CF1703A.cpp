#include <bits/stdc++.h>
#include <cmath>
using namespace std;

int main() {
	int n;
	scanf("%d", &n);
	while(n--) {
		string s;
		cin >> s;
		transform(s.begin(), s.end(), s.begin(), ::toupper);
		if (s == "YES")
			cout << s << endl;
		else cout << "NO" << endl;
	}
}