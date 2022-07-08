#include <bits/stdc++.h>
using namespace std;

int main() {
	int n;
	cin >> n;
	while(n--) {
		int a, b, c, d;
		scanf("%d %d %d %d", &a, &b, &c, &d);
		int result = a + b + c + d;
		if (result == 0) printf("0\n");
		else if (result == 4) printf("2\n");
		else printf("1\n");
	}
	return 0;
}