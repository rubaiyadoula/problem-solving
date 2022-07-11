#include <bits/stdc++.h>
#include <cmath>
using namespace std;

int main() {
	int n;
	scanf("%d", &n);
	while(n--) {
		int m, d, k;
		scanf("%d", &m);
		int num = m;
		int count = 0;
		for (count = 0; num > 0; count++){
	        num = num / 10;
	    }
		k = pow(10, count - 1);
		d = m - k;
		printf("%d\n", d);
	}
}