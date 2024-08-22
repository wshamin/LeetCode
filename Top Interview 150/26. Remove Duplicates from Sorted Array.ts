function removeDuplicates(nums: number[]): number {
    let k = 0;

    for (let i = 0; i < nums.length - 1; i++) {
        if (nums[i] === nums[i + 1]) {
            nums[i] = undefined;
            k++;
        }
    }

    nums.sort((a, b) => {
        if (a > b || a === undefined) {
            return 1;
        } else {
            return -1;
        }
    })

    return nums.length - k;
}
