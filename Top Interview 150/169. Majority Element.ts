function majorityElement(nums: number[]): number {
    nums.sort((a, b) => {
        if (a > b) return 1;
        else return -1;
    });

    return nums[Math.floor(nums.length / 2)];
}
