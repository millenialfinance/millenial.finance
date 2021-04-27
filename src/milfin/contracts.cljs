(ns milfin.contracts)

(def chain->contracts
  {:bsc {
         :milzap               {:abistr "[{\"anonymous\":false,
\"inputs\":[{\"indexed\":true,
\"internalType\":\"address\",
\"name\":\"previousOwner\",
\"type\":\"address\"},
{\"indexed\":true,
\"internalType\":\"address\",
\"name\":\"newOwner\",
\"type\":\"address\"}],
\"name\":\"OwnershipTransferred\",
\"type\":\"event\"},
{\"inputs\":[{\"internalType\":\"address\",
\"name\":\"_token\",
\"type\":\"address\"},
{\"internalType\":\"bool\",
\"name\":\"_isLP\",
\"type\":\"bool\"}],
\"name\":\"addToken\",
\"outputs\":[],
\"stateMutability\":\"nonpayable\",
\"type\":\"function\"},
{\"inputs\":[],
\"name\":\"initialize\",
\"outputs\":[],
\"stateMutability\":\"nonpayable\",
\"type\":\"function\"},
{\"inputs\":[],
\"name\":\"owner\",
\"outputs\":[{\"internalType\":\"address\",
\"name\":\"\",
\"type\":\"address\"}],
\"stateMutability\":\"view\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"uint256\",
\"name\":\"i\",
\"type\":\"uint256\"}],
\"name\":\"removeToken\",
\"outputs\":[],
\"stateMutability\":\"nonpayable\",
\"type\":\"function\"},
{\"inputs\":[],
\"name\":\"renounceOwnership\",
\"outputs\":[],
\"stateMutability\":\"nonpayable\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"address\",
\"name\":\"_address\",
\"type\":\"address\"}],
\"name\":\"routePair\",
\"outputs\":[{\"internalType\":\"address\",
\"name\":\"\",
\"type\":\"address\"}],
\"stateMutability\":\"view\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"address\",
\"name\":\"asset\",
\"type\":\"address\"},
{\"internalType\":\"address\",
\"name\":\"route\",
\"type\":\"address\"}],
\"name\":\"setRoutePairAddress\",
\"outputs\":[],
\"stateMutability\":\"nonpayable\",
\"type\":\"function\"},
{\"inputs\":[],
\"name\":\"sweep\",
\"outputs\":[],
\"stateMutability\":\"nonpayable\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"uint256\",
\"name\":\"\",
\"type\":\"uint256\"}],
\"name\":\"tokens\",
\"outputs\":[{\"internalType\":\"address\",
\"name\":\"\",
\"type\":\"address\"}],
\"stateMutability\":\"view\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"address\",
\"name\":\"newOwner\",
\"type\":\"address\"}],
\"name\":\"transferOwnership\",
\"outputs\":[],
\"stateMutability\":\"nonpayable\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"address\",
\"name\":\"token\",
\"type\":\"address\"}],
\"name\":\"withdraw\",
\"outputs\":[],
\"stateMutability\":\"nonpayable\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"address\",
\"name\":\"_to\",
\"type\":\"address\"}],
\"name\":\"zapIn\",
\"outputs\":[],
\"stateMutability\":\"payable\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"address\",
\"name\":\"_from\",
\"type\":\"address\"},
{\"internalType\":\"uint256\",
\"name\":\"amount\",
\"type\":\"uint256\"},
{\"internalType\":\"address\",
\"name\":\"_to\",
\"type\":\"address\"}],
\"name\":\"zapInToken\",
\"outputs\":[],
\"stateMutability\":\"nonpayable\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"address\",
\"name\":\"_from\",
\"type\":\"address\"},
{\"internalType\":\"uint256\",
\"name\":\"amount\",
\"type\":\"uint256\"}],
\"name\":\"zapOut\",
\"outputs\":[],
\"stateMutability\":\"nonpayable\",
\"type\":\"function\"},
{\"stateMutability\":\"payable\",
\"type\":\"receive\"}]"
                                :addr "0x2EbC914Dbbb3E7f651Dcd18e5cD68de9e2A61007"
                                :name "Millenial Finance Zapper"
                                :chain :bsc
                                :type :zap
                                }
         :popsicle-sorbettiere {:abistr "[{\"inputs\":[{\"internalType\":\"contract IERC20\",\"name\":\"_ice\",\"type\":\"address\"},{\"internalType\":\"uint256\",\"name\":\"_icePerSecond\",\"type\":\"uint256\"},{\"internalType\":\"uint32\",\"name\":\"_startTime\",\"type\":\"uint32\"}],\"stateMutability\":\"nonpayable\",\"type\":\"constructor\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":true,\"internalType\":\"address\",\"name\":\"user\",\"type\":\"address\"},{\"indexed\":true,\"internalType\":\"uint256\",\"name\":\"pid\",\"type\":\"uint256\"},{\"indexed\":false,\"internalType\":\"uint256\",\"name\":\"amount\",\"type\":\"uint256\"}],\"name\":\"Deposit\",\"type\":\"event\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":true,\"internalType\":\"address\",\"name\":\"user\",\"type\":\"address\"},{\"indexed\":true,\"internalType\":\"uint256\",\"name\":\"pid\",\"type\":\"uint256\"},{\"indexed\":false,\"internalType\":\"uint256\",\"name\":\"amount\",\"type\":\"uint256\"}],\"name\":\"EmergencyWithdraw\",\"type\":\"event\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":true,\"internalType\":\"address\",\"name\":\"previousOwner\",\"type\":\"address\"},{\"indexed\":true,\"internalType\":\"address\",\"name\":\"newOwner\",\"type\":\"address\"}],\"name\":\"OwnershipTransferred\",\"type\":\"event\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":true,\"internalType\":\"address\",\"name\":\"user\",\"type\":\"address\"},{\"indexed\":true,\"internalType\":\"uint256\",\"name\":\"pid\",\"type\":\"uint256\"},{\"indexed\":false,\"internalType\":\"uint256\",\"name\":\"amount\",\"type\":\"uint256\"}],\"name\":\"Withdraw\",\"type\":\"event\"},{\"inputs\":[{\"internalType\":\"uint16\",\"name\":\"_allocPoint\",\"type\":\"uint16\"},{\"internalType\":\"contract IERC20\",\"name\":\"_stakingToken\",\"type\":\"address\"},{\"internalType\":\"bool\",\"name\":\"_withUpdate\",\"type\":\"bool\"}],\"name\":\"add\",\"outputs\":[],\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"inputs\":[{\"internalType\":\"uint32\",\"name\":\"addSeconds\",\"type\":\"uint32\"}],\"name\":\"changeEndTime\",\"outputs\":[],\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"inputs\":[{\"internalType\":\"uint256\",\"name\":\"_pid\",\"type\":\"uint256\"},{\"internalType\":\"uint256\",\"name\":\"_amount\",\"type\":\"uint256\"}],\"name\":\"deposit\",\"outputs\":[],\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"inputs\":[],\"name\":\"endTime\",\"outputs\":[{\"internalType\":\"uint32\",\"name\":\"\",\"type\":\"uint32\"}],\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[{\"internalType\":\"uint256\",\"name\":\"_from\",\"type\":\"uint256\"},{\"internalType\":\"uint256\",\"name\":\"_to\",\"type\":\"uint256\"}],\"name\":\"getMultiplier\",\"outputs\":[{\"internalType\":\"uint256\",\"name\":\"\",\"type\":\"uint256\"}],\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[],\"name\":\"ice\",\"outputs\":[{\"internalType\":\"contract IERC20\",\"name\":\"\",\"type\":\"address\"}],\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[],\"name\":\"icePerSecond\",\"outputs\":[{\"internalType\":\"uint256\",\"name\":\"\",\"type\":\"uint256\"}],\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[],\"name\":\"massUpdatePools\",\"outputs\":[],\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"inputs\":[],\"name\":\"owner\",\"outputs\":[{\"internalType\":\"address\",\"name\":\"\",\"type\":\"address\"}],\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[{\"internalType\":\"uint256\",\"name\":\"_pid\",\"type\":\"uint256\"},{\"internalType\":\"address\",\"name\":\"_user\",\"type\":\"address\"}],\"name\":\"pendingIce\",\"outputs\":[{\"internalType\":\"uint256\",\"name\":\"\",\"type\":\"uint256\"}],\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[{\"internalType\":\"uint256\",\"name\":\"\",\"type\":\"uint256\"}],\"name\":\"poolInfo\",\"outputs\":[{\"internalType\":\"contract IERC20\",\"name\":\"stakingToken\",\"type\":\"address\"},{\"internalType\":\"uint256\",\"name\":\"stakingTokenTotalAmount\",\"type\":\"uint256\"},{\"internalType\":\"uint256\",\"name\":\"accIcePerShare\",\"type\":\"uint256\"},{\"internalType\":\"uint32\",\"name\":\"lastRewardTime\",\"type\":\"uint32\"},{\"internalType\":\"uint16\",\"name\":\"allocPoint\",\"type\":\"uint16\"}],\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[],\"name\":\"poolLength\",\"outputs\":[{\"internalType\":\"uint256\",\"name\":\"\",\"type\":\"uint256\"}],\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[],\"name\":\"renounceOwnership\",\"outputs\":[],\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"inputs\":[{\"internalType\":\"uint256\",\"name\":\"_pid\",\"type\":\"uint256\"},{\"internalType\":\"uint16\",\"name\":\"_allocPoint\",\"type\":\"uint16\"},{\"internalType\":\"bool\",\"name\":\"_withUpdate\",\"type\":\"bool\"}],\"name\":\"set\",\"outputs\":[],\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"inputs\":[{\"internalType\":\"uint256\",\"name\":\"_icePerSecond\",\"type\":\"uint256\"},{\"internalType\":\"bool\",\"name\":\"_withUpdate\",\"type\":\"bool\"}],\"name\":\"setIcePerSecond\",\"outputs\":[],\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"inputs\":[],\"name\":\"startTime\",\"outputs\":[{\"internalType\":\"uint32\",\"name\":\"\",\"type\":\"uint32\"}],\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[],\"name\":\"totalAllocPoint\",\"outputs\":[{\"internalType\":\"uint256\",\"name\":\"\",\"type\":\"uint256\"}],\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[{\"internalType\":\"address\",\"name\":\"newOwner\",\"type\":\"address\"}],\"name\":\"transferOwnership\",\"outputs\":[],\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"inputs\":[{\"internalType\":\"uint256\",\"name\":\"_pid\",\"type\":\"uint256\"}],\"name\":\"updatePool\",\"outputs\":[],\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"inputs\":[{\"internalType\":\"uint256\",\"name\":\"\",\"type\":\"uint256\"},{\"internalType\":\"address\",\"name\":\"\",\"type\":\"address\"}],\"name\":\"userInfo\",\"outputs\":[{\"internalType\":\"uint256\",\"name\":\"amount\",\"type\":\"uint256\"},{\"internalType\":\"uint256\",\"name\":\"rewardDebt\",\"type\":\"uint256\"},{\"internalType\":\"uint256\",\"name\":\"remainingIceTokenReward\",\"type\":\"uint256\"}],\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[{\"internalType\":\"uint256\",\"name\":\"_pid\",\"type\":\"uint256\"},{\"internalType\":\"uint256\",\"name\":\"_amount\",\"type\":\"uint256\"}],\"name\":\"withdraw\",\"outputs\":[],\"stateMutability\":\"nonpayable\",\"type\":\"function\"}]"
                                :addr "0x05200cB2Cee4B6144B2B2984E246B52bB1afcBD0"
                                :name "Popsicle Finance - Sorbettiere"
                                :type :pool
                                :chain :bsc
                                :pending-reward-fn-name "pendingIce"}
                                :bep20 
                                {:abistr "[{\"anonymous\":false,
\"inputs\":[{\"indexed\":true,
\"internalType\":\"address\",
\"name\":\"owner\",
\"type\":\"address\"},
{\"indexed\":true,
\"internalType\":\"address\",
\"name\":\"spender\",
\"type\":\"address\"},
{\"indexed\":false,
\"internalType\":\"uint256\",
\"name\":\"value\",
\"type\":\"uint256\"}],
\"name\":\"Approval\",
\"type\":\"event\"},
{\"anonymous\":false,
\"inputs\":[{\"indexed\":true,
\"internalType\":\"address\",
\"name\":\"delegator\",
\"type\":\"address\"},
{\"indexed\":true,
\"internalType\":\"address\",
\"name\":\"fromDelegate\",
\"type\":\"address\"},
{\"indexed\":true,
\"internalType\":\"address\",
\"name\":\"toDelegate\",
\"type\":\"address\"}],
\"name\":\"DelegateChanged\",
\"type\":\"event\"},
{\"anonymous\":false,
\"inputs\":[{\"indexed\":true,
\"internalType\":\"address\",
\"name\":\"delegate\",
\"type\":\"address\"},
{\"indexed\":false,
\"internalType\":\"uint256\",
\"name\":\"previousBalance\",
\"type\":\"uint256\"},
{\"indexed\":false,
\"internalType\":\"uint256\",
\"name\":\"newBalance\",
\"type\":\"uint256\"}],
\"name\":\"DelegateVotesChanged\",
\"type\":\"event\"},
{\"anonymous\":false,
\"inputs\":[{\"indexed\":true,
\"internalType\":\"address\",
\"name\":\"previousOwner\",
\"type\":\"address\"},
{\"indexed\":true,
\"internalType\":\"address\",
\"name\":\"newOwner\",
\"type\":\"address\"}],
\"name\":\"OwnershipTransferred\",
\"type\":\"event\"},
{\"anonymous\":false,
\"inputs\":[{\"indexed\":true,
\"internalType\":\"address\",
\"name\":\"from\",
\"type\":\"address\"},
{\"indexed\":true,
\"internalType\":\"address\",
\"name\":\"to\",
\"type\":\"address\"},
{\"indexed\":false,
\"internalType\":\"uint256\",
\"name\":\"value\",
\"type\":\"uint256\"}],
\"name\":\"Transfer\",
\"type\":\"event\"},
{\"inputs\":[],
\"name\":\"DELEGATION_TYPEHASH\",
\"outputs\":[{\"internalType\":\"bytes32\",
\"name\":\"\",
\"type\":\"bytes32\"}],
\"stateMutability\":\"view\",
\"type\":\"function\"},
{\"inputs\":[],
\"name\":\"DOMAIN_TYPEHASH\",
\"outputs\":[{\"internalType\":\"bytes32\",
\"name\":\"\",
\"type\":\"bytes32\"}],
\"stateMutability\":\"view\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"address\",
\"name\":\"owner\",
\"type\":\"address\"},
{\"internalType\":\"address\",
\"name\":\"spender\",
\"type\":\"address\"}],
\"name\":\"allowance\",
\"outputs\":[{\"internalType\":\"uint256\",
\"name\":\"\",
\"type\":\"uint256\"}],
\"stateMutability\":\"view\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"address\",
\"name\":\"spender\",
\"type\":\"address\"},
{\"internalType\":\"uint256\",
\"name\":\"amount\",
\"type\":\"uint256\"}],
\"name\":\"approve\",
\"outputs\":[{\"internalType\":\"bool\",
\"name\":\"\",
\"type\":\"bool\"}],
\"stateMutability\":\"nonpayable\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"address\",
\"name\":\"account\",
\"type\":\"address\"}],
\"name\":\"balanceOf\",
\"outputs\":[{\"internalType\":\"uint256\",
\"name\":\"\",
\"type\":\"uint256\"}],
\"stateMutability\":\"view\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"address\",
\"name\":\"\",
\"type\":\"address\"},
{\"internalType\":\"uint32\",
\"name\":\"\",
\"type\":\"uint32\"}],
\"name\":\"checkpoints\",
\"outputs\":[{\"internalType\":\"uint32\",
\"name\":\"fromBlock\",
\"type\":\"uint32\"},
{\"internalType\":\"uint256\",
\"name\":\"votes\",
\"type\":\"uint256\"}],
\"stateMutability\":\"view\",
\"type\":\"function\"},
{\"inputs\":[],
\"name\":\"decimals\",
\"outputs\":[{\"internalType\":\"uint8\",
\"name\":\"\",
\"type\":\"uint8\"}],
\"stateMutability\":\"view\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"address\",
\"name\":\"spender\",
\"type\":\"address\"},
{\"internalType\":\"uint256\",
\"name\":\"subtractedValue\",
\"type\":\"uint256\"}],
\"name\":\"decreaseAllowance\",
\"outputs\":[{\"internalType\":\"bool\",
\"name\":\"\",
\"type\":\"bool\"}],
\"stateMutability\":\"nonpayable\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"address\",
\"name\":\"delegatee\",
\"type\":\"address\"}],
\"name\":\"delegate\",
\"outputs\":[],
\"stateMutability\":\"nonpayable\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"address\",
\"name\":\"delegatee\",
\"type\":\"address\"},
{\"internalType\":\"uint256\",
\"name\":\"nonce\",
\"type\":\"uint256\"},
{\"internalType\":\"uint256\",
\"name\":\"expiry\",
\"type\":\"uint256\"},
{\"internalType\":\"uint8\",
\"name\":\"v\",
\"type\":\"uint8\"},
{\"internalType\":\"bytes32\",
\"name\":\"r\",
\"type\":\"bytes32\"},
{\"internalType\":\"bytes32\",
\"name\":\"s\",
\"type\":\"bytes32\"}],
\"name\":\"delegateBySig\",
\"outputs\":[],
\"stateMutability\":\"nonpayable\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"address\",
\"name\":\"delegator\",
\"type\":\"address\"}],
\"name\":\"delegates\",
\"outputs\":[{\"internalType\":\"address\",
\"name\":\"\",
\"type\":\"address\"}],
\"stateMutability\":\"view\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"address\",
\"name\":\"account\",
\"type\":\"address\"}],
\"name\":\"getCurrentVotes\",
\"outputs\":[{\"internalType\":\"uint256\",
\"name\":\"\",
\"type\":\"uint256\"}],
\"stateMutability\":\"view\",
\"type\":\"function\"},
{\"inputs\":[],
\"name\":\"getOwner\",
\"outputs\":[{\"internalType\":\"address\",
\"name\":\"\",
\"type\":\"address\"}],
\"stateMutability\":\"view\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"address\",
\"name\":\"account\",
\"type\":\"address\"},
{\"internalType\":\"uint256\",
\"name\":\"blockNumber\",
\"type\":\"uint256\"}],
\"name\":\"getPriorVotes\",
\"outputs\":[{\"internalType\":\"uint256\",
\"name\":\"\",
\"type\":\"uint256\"}],
\"stateMutability\":\"view\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"address\",
\"name\":\"spender\",
\"type\":\"address\"},
{\"internalType\":\"uint256\",
\"name\":\"addedValue\",
\"type\":\"uint256\"}],
\"name\":\"increaseAllowance\",
\"outputs\":[{\"internalType\":\"bool\",
\"name\":\"\",
\"type\":\"bool\"}],
\"stateMutability\":\"nonpayable\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"address\",
\"name\":\"_to\",
\"type\":\"address\"},
{\"internalType\":\"uint256\",
\"name\":\"_amount\",
\"type\":\"uint256\"}],
\"name\":\"mint\",
\"outputs\":[],
\"stateMutability\":\"nonpayable\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"uint256\",
\"name\":\"amount\",
\"type\":\"uint256\"}],
\"name\":\"mint\",
\"outputs\":[{\"internalType\":\"bool\",
\"name\":\"\",
\"type\":\"bool\"}],
\"stateMutability\":\"nonpayable\",
\"type\":\"function\"},
{\"inputs\":[],
\"name\":\"name\",
\"outputs\":[{\"internalType\":\"string\",
\"name\":\"\",
\"type\":\"string\"}],
\"stateMutability\":\"view\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"address\",
\"name\":\"\",
\"type\":\"address\"}],
\"name\":\"nonces\",
\"outputs\":[{\"internalType\":\"uint256\",
\"name\":\"\",
\"type\":\"uint256\"}],
\"stateMutability\":\"view\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"address\",
\"name\":\"\",
\"type\":\"address\"}],
\"name\":\"numCheckpoints\",
\"outputs\":[{\"internalType\":\"uint32\",
\"name\":\"\",
\"type\":\"uint32\"}],
\"stateMutability\":\"view\",
\"type\":\"function\"},
{\"inputs\":[],
\"name\":\"owner\",
\"outputs\":[{\"internalType\":\"address\",
\"name\":\"\",
\"type\":\"address\"}],
\"stateMutability\":\"view\",
\"type\":\"function\"},
{\"inputs\":[],
\"name\":\"renounceOwnership\",
\"outputs\":[],
\"stateMutability\":\"nonpayable\",
\"type\":\"function\"},
{\"inputs\":[],
\"name\":\"symbol\",
\"outputs\":[{\"internalType\":\"string\",
\"name\":\"\",
\"type\":\"string\"}],
\"stateMutability\":\"view\",
\"type\":\"function\"},
{\"inputs\":[],
\"name\":\"totalSupply\",
\"outputs\":[{\"internalType\":\"uint256\",
\"name\":\"\",
\"type\":\"uint256\"}],
\"stateMutability\":\"view\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"address\",
\"name\":\"recipient\",
\"type\":\"address\"},
{\"internalType\":\"uint256\",
\"name\":\"amount\",
\"type\":\"uint256\"}],
\"name\":\"transfer\",
\"outputs\":[{\"internalType\":\"bool\",
\"name\":\"\",
\"type\":\"bool\"}],
\"stateMutability\":\"nonpayable\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"address\",
\"name\":\"sender\",
\"type\":\"address\"},
{\"internalType\":\"address\",
\"name\":\"recipient\",
\"type\":\"address\"},
{\"internalType\":\"uint256\",
\"name\":\"amount\",
\"type\":\"uint256\"}],
\"name\":\"transferFrom\",
\"outputs\":[{\"internalType\":\"bool\",
\"name\":\"\",
\"type\":\"bool\"}],
\"stateMutability\":\"nonpayable\",
\"type\":\"function\"},
{\"inputs\":[{\"internalType\":\"address\",
\"name\":\"newOwner\",
\"type\":\"address\"}],
\"name\":\"transferOwnership\",
\"outputs\":[],
\"stateMutability\":\"nonpayable\",
\"type\":\"function\"}]"
                                :type :utility
                                :name "ERC20"
                                }
         }})

(defn parse-abistr
  [abistr]
  (js->clj (.parse js/JSON abistr) :keywordize-keys true))
