

// issue--> BeanA (singleton) --> autowiring BeanB (prototype)--> when access --> singleton triggered
// means initiate only one time in context but BeanB is prototype needs multiple instances
// but BeanA is initiated only once so BeanB will be initiated only once (but needed multiple)
// to fix that issue we have multiple ways
1> 