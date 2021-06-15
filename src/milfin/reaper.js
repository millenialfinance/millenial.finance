const lpTokenAbi = false;
const vaultAbi = false;
const strategyAbiBoo = false;
const strategyAbiSpirit = false;
const strategyAbiLiquid = false;
const strategyAbiWaka = false;
const strategyAbiSteak = false;
const strategyAbiTomb = false;
const strategyAbiIceSushi = false;
const strategyAbiIceSpooky = false;
const coins = {
  AAVE: {"name": "AAVE", "address": "0x6a07A792ab2965C72a5B8088d3a069A7aC3a993B"},
  ANY: {"name": "ANY", "address": "0xdDcb3fFD12750B45d32E084887fdf1aABAb34239"},
  ATRI: {"name": "ATRI", "address": "0x0370dC24570ED93DB0b67d20340923E56c0aADD9"},
  AURORA: {"name": "AURORA", "address": "0xbc2451AaD349b6B43FD05F4F0cC327F8A6bcA2d4"},
  BADGER: {"name": "BADGER", "address": "0x753fbc5800a8C8e3Fb6DC6415810d627A387Dfc9"},
  BAND: {"name": "BAND", "address": "0x46E7628E8b4350b2716ab470eE0bA1fa9e76c6C5"},
  BEAN: {"name": "BEAN", "address": "0xbAc5d43A56696e5D0CB631609E85798f564b513b"},
  BNB: {"name": "BNB", "address": "0xd67de0e0a0fd7b15dc8348bb9be742f3c5850454"},
  BOO: {"name": "BOO", "address": "0x841FAD6EAe12c286d1Fd18d1d525DFfA75C7EFFE"},
  BUSD: {"name": "BUSD", "address": "0xc931f61b1534eb21d8c11b24f3f5ab2471d4ab50"},
  COVER: {"name": "COVER", "address": "0xB01E8419d842beebf1b70A7b5f7142abbaf7159D"},
  CREAM: {"name": "CREAM", "address": "0x657A1861c15A3deD9AF0B6799a195a249ebdCbc6"},
  CRV: {"name": "CRV", "address": "0x1E4F97b9f9F913c46F1632781732927B9019C68b"},
  CZTEARS: {"name": "CZTEARS", "address": "0x907f1A48918Bb5DE07c12443CAB0e6EEfCC611BC"},
  DAI: {"name": "DAI", "address": "0x8D11eC38a3EB5E956B052f67Da8Bdc9bef8Abf3E"},
  FRAX: {"name": "FRAX", "address": "0xaf319E5789945197e365E7f7fbFc56B130523B33"},
  FTM: {"name": "FTM", "address": "0x21be370d5312f44cb42ce377bc9b8a0cef1a4c83"},
  fUSD: {"name": "fUSD", "address": "0xad84341756bf337f5a0164515b1f6f993d194e1f"},
  fUSDT: {"name": "fUSDT", "address": "0x049d68029688eabf473097a2fc38ef61633a3c7a"},
  FXS: {"name": "FXS", "address": "0x82F8Cb20c14F134fe6Ebf7aC3B903B2117aAfa62"},
  ICE: {"name": "ICE", "address": "0xf16e81dce15B08F326220742020379B855B87DF9"},
  LINK: {"name": "LINK", "address": "0xb3654dc3d10ea7645f8319668e8f54d2574fbdc8"},
  LQDR: {"name": "LQDR", "address": "0x10b620b2dbAC4Faa7D7FFD71Da486f5D44cd86f9"},
  MM: {"name": "MM", "address": "0xbfaf328fe059c53d936876141f38089df0d1503d"},
  ORI: {"name": "ORI", "address": "0x0575f8738EFdA7F512e3654F277C77e80C7d2725"},
  SFI: {"name": "SFI", "address": "0x924828a9Fb17d47D0eb64b57271D10706699Ff11"},
  SNX: {"name": "SNX", "address": "0x56ee926bD8c72B2d5fa1aF4d9E4Cbb515a1E3Adc"},
  SPIRIT: {"name": "SPIRIT", "address": "0x5Cc61A78F164885776AA610fb0FE1257df78E59B"},
  SUSHI: {"name": "SUSHI", "address": "0xae75A438b2E0cB8Bb01Ec1E1e376De11D44477CC"},
  STEAK: {"name": "STEAK", "address": "0x05848B832E872d9eDd84AC5718D58f21fD9c9649"},
  TOMB: {"name": "TOMB", "address": "0x6c021Ae822BEa943b2E66552bDe1D2696a53fbB7"},
  TSHARE: {"name": "TSHARES", "address": "0x4cdF39285D7Ca8eB3f090fDA0C069ba5F4145B37"},
  USDC: {"name": "USDC", "address": "0x04068DA6C83AFCFA0e13ba15A6696662335D5B75"},
  WAKA: {"name": "WAKA", "address": "0xf61cCdE1D4bB76CeD1dAa9D4c429cCA83022B08B"},
  WBTC: {"name": "WBTC", "address": "0x321162Cd933E2Be498Cd2267a90534A804051b11"},
  WETH: {"name": "WETH", "address": "0x74b23882a30290451A17c44f4F05243b6b58C76d"},
  WOOFY: {"name": "WOOFY", "address": "0xD0660cD418a64a1d44E9214ad8e459324D8157f1"},
  YFI: {"name": "YFI", "address": "0x29b0Da86e484E1C0029B56e817912d778aC0EC69"},
  ZOO: {"name": "ZOO", "address": "0x09e145A1D53c0045F41aEEf25D8ff982ae74dD56"}
};

export const treasury = "0x0e7c5313E9BB80b654734d9b7aB1FB01468deE3b";

const defaultFee = "0.045";
const liquidDepFee = "0.01";

const vaults = {
  "spooky": {
    "masterChef": "0x2b2929E785374c651a81A63878Ab22742656DcDd",
    "uniRouter": "0xF491e7B69E4244ad4002BC14e878a34207E38c29",
    "uniFactory": "0x152eE697f2E276fA89E96742e9bB9aB1F2E61bE3",
    "rewardToken": "0x841FAD6EAe12c286d1Fd18d1d525DFfA75C7EFFE",
    "emissionMultiplier": "1",
    "farms": [
      {
        "pid": 0,
        "name": "BOO Single-Sided Crypt",
        "symbol": "rfBOO",
        "tokens": [coins.BOO.name],
        "addresses": [coins.BOO.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken":{
          "address": "0x841FAD6EAe12c286d1Fd18d1d525DFfA75C7EFFE",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x08a9A35A70d1AE4D9c1035fc92ab5D278f4B7800",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xc4628241f3df66A01747885c2A5940622Ec83E46",
          "abi": strategyAbiBoo
        },
        "addLiquidity": "https://spookyswap.finance/add/FTM/0x841FAD6EAe12c286d1Fd18d1d525DFfA75C7EFFE",
        "deprecated": false,
        "singleSided": true
      },
      {
        "pid": 0,
        "name": "FTM-BOO Spooky Crypt",
        "symbol": "rfFTMBOO",
        "tokens": [coins.FTM.name, coins.BOO.name],
        "addresses": [coins.FTM.address, coins.BOO.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xEc7178F4C41f346b2721907F5cF7628E388A7a58",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xc653C5128C8D135FF8ad796353128AFf872Ff1bA",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x8aC0Cd0710AD12D9748e3638CFB65296cF13F916",
          "abi": strategyAbiBoo
        },
        "addLiquidity": "https://spookyswap.finance/add/FTM/0x841FAD6EAe12c286d1Fd18d1d525DFfA75C7EFFE",
        "deprecated": false
      },
      {
        "pid": 22,
        "name": "FTM-ANY Spooky Crypt",
        "symbol": "rfFTMANY",
        "tokens": [coins.FTM.name, coins.ANY.name],
        "addresses": [coins.FTM.address, coins.ANY.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x5c021D9cfaD40aaFC57786b409A9ce571de375b4",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x75e9d0fe21e47A5ea584e7cd3FDfD6494b5C6d26",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x3AAe4ABB7Dc375dF50e4c5F2251af8a615CCd4d9",
          "abi": strategyAbiBoo
        },
        "addLiquidity": "https://spookyswap.finance/add/FTM/0x82F8Cb20c14F134fe6Ebf7aC3B903B2117aAfa62",
        "deprecated": false
      },
      {
        "pid": 1,
        "name": "FTM-fUSDT Spooky Crypt",
        "symbol": "rfFTMFUSDT",
        "tokens": [coins.FTM.name, coins.fUSDT.name],
        "addresses": [coins.FTM.address, coins.fUSDT.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x5965E53aa80a0bcF1CD6dbDd72e6A9b2AA047410",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x0351C62325b91dB8A67C00C489c71878203A0bBb",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xB5cf8877C50A43c6597013D296AA31679D829FfF",
          "abi": strategyAbiBoo
        },
        "addLiquidity": "https://spookyswap.finance/add/FTM/0x049d68029688eAbF473097a2fC38ef61633A3C7A",
        "deprecated": false
      },
      {
        "pid": 2,
        "name": "FTM-USDC Spooky Crypt",
        "symbol": "rfFTMUSDC",
        "tokens": [coins.FTM.name, coins.USDC.name],
        "addresses": [coins.FTM.address, coins.USDC.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x2b4C76d0dc16BE1C31D4C1DC53bF9B45987Fc75c",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x98010a39f41E2EF41c4943936BD852a1843C9574",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x0E6aDe2Dec2C4e93503b5A17c2FA94719a886747",
          "abi": strategyAbiBoo
        },
        "addLiquidity": "https://spookyswap.finance/add/FTM/0x04068DA6C83AFCFA0e13ba15A6696662335D5B75",
        "deprecated": false
      },
      {
        "pid": 3,
        "name": "FTM-DAI Spooky Crypt",
        "symbol": "rfFTMDAI",
        "tokens": [coins.FTM.name, coins.DAI.name],
        "addresses": [coins.FTM.address, coins.DAI.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xe120ffBDA0d14f3Bb6d6053E90E63c572A66a428",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xBfa72c1dEdf01D8d23B471BB4C6b58ad56000D49",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xE2FAD0Ce7535cdd90A731CF0e067880b800F4Ef2",
          "abi": strategyAbiBoo
        },
        "addLiquidity": "https://spookyswap.finance/add/FTM/0x8D11eC38a3EB5E956B052f67Da8Bdc9bef8Abf3E",
        "deprecated": false
      },
      {
        "pid": 4,
        "name": "FTM-BTC Spooky Crypt",
        "symbol": "rfFTMBTC",
        "tokens": [coins.FTM.name, coins.WBTC.name],
        "addresses": [coins.FTM.address, coins.WBTC.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xFdb9Ab8B9513Ad9E419Cf19530feE49d412C3Ee3",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x7270071225BA3CCB46a8bed2E99309BB02c576B9",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xb6aa9F7486A7C875E16B6229B3D78F9EF40371E7",
          "abi": strategyAbiBoo
        },
        "addLiquidity": "https://spookyswap.finance/add/FTM/0x321162Cd933E2Be498Cd2267a90534A804051b11",
        "deprecated": false
      },
      {
        "pid": 5,
        "name": "FTM-ETH Spooky Crypt",
        "symbol": "rfFTMETH",
        "tokens": [coins.FTM.name, coins.WETH.name],
        "addresses": [coins.FTM.address, coins.WETH.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xf0702249F4D3A25cD3DED7859a165693685Ab577",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x55b0F1c2414334b1Bdd091e53d95D66D936Aa944",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x16e15027d513AD43037a1A895309969834a6a081",
          "abi": strategyAbiBoo
        },
        "addLiquidity": "https://spookyswap.finance/add/FTM/0x74b23882a30290451A17c44f4F05243b6b58C76d",
        "deprecated": false
      },
      {
        "pid": 6,
        "name": "FTM-LINK Spooky Crypt",
        "symbol": "rfFTMLINK",
        "tokens": [coins.FTM.name, coins.LINK.name],
        "addresses": [coins.FTM.address, coins.LINK.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x89d9bC2F2d091CfBFc31e333D6Dc555dDBc2fd29",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x50BFB487698335Ad58b3cA1135Eb66D1dD7D368f",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x996CFF2cD997387c5B68b655544B69385927DcF9",
          "abi": strategyAbiBoo
        },
        "addLiquidity": "https://spookyswap.finance/add/FTM/0xb3654dc3D10Ea7645f8319668E8F54d2574FBdC8",
        "deprecated": false
      },
      {
        "pid": 7,
        "name": "FTM-AAVE Spooky Crypt",
        "symbol": "rfFTMAAVE",
        "tokens": [coins.FTM.name, coins.AAVE.name],
        "addresses": [coins.FTM.address, coins.AAVE.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xeBF374bB21D83Cf010cC7363918776aDF6FF2BF6",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x8DC2B5532A2b3245ded3406a064e8452E8364Ee3",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x9371976A2a15C1d5f600137D6d79FabA7ac1617a",
          "abi": strategyAbiBoo
        },
        "addLiquidity": "https://spookyswap.finance/add/FTM/0x6a07A792ab2965C72a5B8088d3a069A7aC3a993B",
        "deprecated": false
      },
      {
        "pid": 8,
        "name": "FTM-SNX Spooky Crypt",
        "symbol": "rfFTMSNX",
        "tokens": [coins.FTM.name, coins.SNX.name],
        "addresses": [coins.FTM.address, coins.SNX.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x06d173628bE105fE81F1C82c9979bA79eBCAfCB7",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xDb6721a1FC3Cec2a5a8af2c5946beD3D60843C1c",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x9545d353C37d887272B86d9cBD86db0044Ccdd96",
          "abi": strategyAbiBoo
        },
        "addLiquidity": "https://spookyswap.finance/add/FTM/0x56ee926bD8c72B2d5fa1aF4d9E4Cbb515a1E3Adc",
        "deprecated": false
      },
      {
        "pid": 9,
        "name": "FTM-YFI Spooky Crypt",
        "symbol": "rfFTMYFI",
        "tokens": [coins.FTM.name, coins.YFI.name],
        "addresses": [coins.FTM.address, coins.YFI.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xBf4d61d4cec3a9DFf7452D8987E1Cc2943e2EB4C",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x3D089b939bd10D3d06A7cF4987b93858c99f562F",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x6DE53A0EBe18753861021e4491FF2A17e2430C69",
          "abi": strategyAbiBoo
        },
        "addLiquidity": "https://spookyswap.finance/add/FTM/0x29b0Da86e484E1C0029B56e817912d778aC0EC69",
        "deprecated": true
      },
      {
        "pid": 10,
        "name": "FTM-SUSHI Spooky Crypt",
        "symbol": "rfFTMSUSHI",
        "tokens": [coins.FTM.name, coins.SUSHI.name],
        "addresses": [coins.FTM.address, coins.SUSHI.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xf84E313B36E86315af7a06ff26C8b20e9EB443C3",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x60cB193Fc6864769728c85D534B462A3469f9409",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x2d3239ac528C82001AA381d6a7dc04B3b17f7406",
          "abi": strategyAbiBoo
        },
        "addLiquidity": "https://spookyswap.finance/add/FTM/0xae75A438b2E0cB8Bb01Ec1E1e376De11D44477CC",
        "deprecated": false
      },
      {
        "pid": 11,
        "name": "FTM-SFI Spooky Crypt",
        "symbol": "rfFTMSFI",
        "tokens": [coins.FTM.name, coins.SFI.name],
        "addresses": [coins.FTM.address, coins.SFI.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x01424C64c4744769299019bE64F3d82898fF28f3",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x05992C4253DD028299B497d491f52bDA674919C6",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xfae5E1E96907e7949A38BA29450424B79304761c",
          "abi": strategyAbiBoo
        },
        "addLiquidity": "https://spookyswap.finance/add/FTM/0x924828a9Fb17d47D0eb64b57271D10706699Ff11",
        "deprecated": true
      },
      {
        "pid": 12,
        "name": "FTM-BAND Spooky Crypt",
        "symbol": "rfFTMBAND",
        "tokens": [coins.FTM.name, coins.BAND.name],
        "addresses": [coins.FTM.address, coins.BAND.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x91b39D5584e2A7DC829f696235742cc293F2e8cf",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xc4F6114e7764128792415AA6e859d79Fe1CFF775",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xC7ba12d8ef255b2CEda437fDe9F32Fd9A9a2254b",
          "abi": strategyAbiBoo
        },
        "addLiquidity": "https://spookyswap.finance/add/FTM/0x46E7628E8b4350b2716ab470eE0bA1fa9e76c6C5",
        "deprecated": false
      },
      {
        "pid": 13,
        "name": "FTM-CREAM Spooky Crypt",
        "symbol": "rfFTMCREAM",
        "tokens": [coins.FTM.name, coins.CREAM.name],
        "addresses": [coins.FTM.address, coins.CREAM.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xb77b223490e1f5951ec79A8d09Db9Eab2ADCB934",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x7Fe81Fa9743Dba1D1E05447c35781871AD26ee47",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x65aa1390E5BE25758d1D62a52763873c2BBf4651",
          "abi": strategyAbiBoo
        },
        "addLiquidity": "https://spookyswap.finance/add/FTM/0x657A1861c15A3deD9AF0B6799a195a249ebdCbc6",
        "deprecated": false
      },
      {
        "pid": 14,
        "name": "FTM-CURVE Spooky Crypt",
        "symbol": "rfFTMCRV",
        "tokens": [coins.FTM.name, coins.CRV.name],
        "addresses": [coins.FTM.address, coins.CRV.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xB471Ac6eF617e952b84C6a9fF5de65A9da96C93B",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x74AD214663121B3A29b1f773f82fdDA9EfdC93C7",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xc45A0f4d5cc41FeA271Cbe235E7742aAE3d70BF5",
          "abi": strategyAbiBoo
        },
        "addLiquidity": "https://spookyswap.finance/add/FTM/0x1E4F97b9f9F913c46F1632781732927B9019C68b",
        "deprecated": false
      },
      {
        "pid": 15,
        "name": "FTM-COVER Spooky Crypt",
        "symbol": "rfFTMCOVER",
        "tokens": [coins.FTM.name, coins.COVER.name],
        "addresses": [coins.FTM.address, coins.COVER.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x5DC7848bF215F1D99F2AF3d2Bf78fcdf238EE34b",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xEB08b9A67F2cdeaE4E9bC86ABe180C316b736C2e",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x33b759D2C6C38B82c08f85e16e975e4b1984dad6",
          "abi": strategyAbiBoo
        },
        "addLiquidity": "https://spookyswap.finance/add/FTM/0xB01E8419d842beebf1b70A7b5f7142abbaf7159D",
        "deprecated": false
      },
      {
        "pid": 16,
        "name": "FTM-BADGER Spooky Crypt",
        "symbol": "rfFTMBADGER",
        "tokens": [coins.FTM.name, coins.BADGER.name],
        "addresses": [coins.FTM.address, coins.BADGER.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x1c94665FD3ecFa969Feda7Ed01e35522e6982022",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x9700ee5Be14DbA8aDC3b3e9202CbE5D4E50e2959",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xEe02A9AB3888f61B83ba8ef6887dccCDa5758041",
          "abi": strategyAbiBoo
        },
        "addLiquidity": "https://spookyswap.finance/add/FTM/0x753fbc5800a8C8e3Fb6DC6415810d627A387Dfc9",
        "deprecated": false
      },
      {
        "pid": 17,
        "name": "FTM-ICE Spooky Crypt",
        "symbol": "rfFTMICE",
        "tokens": [coins.FTM.name, coins.ICE.name],
        "addresses": [coins.FTM.address, coins.ICE.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x623EE4a7F290d11C11315994dB70FB148b13021d",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xD3514644cCc3EC6640E9aC4A4289744377Eb8aBF",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x293fd84E873d662D775BADE47A46b173C470D399",
          "abi": strategyAbiBoo
        },
        "addLiquidity": "https://spookyswap.finance/add/FTM/0xf16e81dce15B08F326220742020379B855B87DF9",
        "deprecated": false
      },
      {
        "pid": 18,
        "name": "FTM-ZOO Spooky Crypt",
        "symbol": "rfFTMZOO",
        "tokens": [coins.FTM.name, coins.ZOO.name],
        "addresses": [coins.FTM.address, coins.ZOO.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x3Cceb477Fcb6cDE90180983642486E68148D7b27",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x7E1110917abAe47D688029Bb57A7186b4D5C6a4F",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xA6fbc4bBfcA634056e44A44327d495A800A0fCf6",
          "abi": strategyAbiBoo
        },
        "addLiquidity": "https://spookyswap.finance/add/FTM/0x09e145A1D53c0045F41aEEf25D8ff982ae74dD56",
        "deprecated": false
      },
      {
        "pid": 19,
        "name": "FTM-BNB Spooky Crypt",
        "symbol": "rfFTMBNB",
        "tokens": [coins.FTM.name, coins.BNB.name],
        "addresses": [coins.FTM.address, coins.BNB.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x956DE13EA0FA5b577E4097Be837BF4aC80005820",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x6AeA0967A4C579e2310F133b200d0A1252a4ba78",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x3e65329738c5F5efFf7b48c8471bfA021098c3A7",
          "abi": strategyAbiBoo
        },
        "addLiquidity": "https://spookyswap.finance/add/FTM/0xD67de0e0a0Fd7b15dC8348Bb9BE742F3c5850454",
        "deprecated": false
      },
      {
        "pid": 20,
        "name": "FTM-WOOFY Spooky Crypt",
        "symbol": "rfFTMWOOFY",
        "tokens": [coins.FTM.name, coins.WOOFY.name],
        "addresses": [coins.FTM.address, coins.WOOFY.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xfD0aB56B83130ce8f2b7A4f4d4532dEe495c0794",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xec1f94e6eF30C13bD1cCA0f9DA24418F1F1eaE90",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xC6F8b1c8996d6F1325922063d339C20965f8413A",
          "abi": strategyAbiBoo
        },
        "addLiquidity": "https://spookyswap.finance/add/FTM/0xD0660cD418a64a1d44E9214ad8e459324D8157f1",
        "deprecated": false
      },
      {
        "pid": 21,
        "name": "filler",
        "symbol": "rfFTMANY",
        "tokens": [coins.FTM.name, coins.ANY.name],
        "addresses": [coins.FTM.address, coins.ANY.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x5c021D9cfaD40aaFC57786b409A9ce571de375b4",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "",
          "abi": strategyAbiBoo
        },
        "addLiquidity": "https://spookyswap.finance/add/FTM/0x82F8Cb20c14F134fe6Ebf7aC3B903B2117aAfa62",
        "deprecated": true
      }
    ]
  },
  "spirit": {
    "masterChef": "0x9083EA3756BDE6Ee6f27a6e996806FBD37F6F093",
    "uniRouter": "0x16327E3FbDaCA3bcF7E38F5Af2599D2DDc33aE52",
    "uniFactory": "0xEF45d134b73241eDa7703fa787148D9C9F4950b0",
    "rewardToken": "0x5Cc61A78F164885776AA610fb0FE1257df78E59B",
    "emissionMultiplier": "1",
    "farms": [
      {
        "pid": 0,
        "name": "Spirit Single-Sided Crypt",
        "symbol": "rfSPIRIT",
        "tokens": [coins.SPIRIT.name],
        "addresses": [coins.SPIRIT.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x5Cc61A78F164885776AA610fb0FE1257df78E59B",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x13713009E6f0AbC3e6a018230fD8c72Bc8d0e6C9",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xDA40e2335041E540510A678de7D52FB90c1418F2",
          "abi": strategyAbiSpirit
        },
        "deprecated": false,
        "singleSided": true,
      },
      {
        "pid": 1,
        "name": "FTM-SPIRIT Spirit Crypt",
        "symbol": "rfFTMSPRT",
        "tokens": [coins.FTM.name, coins.SPIRIT.name],
        "addresses": [coins.FTM.address, coins.SPIRIT.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x30748322B6E34545DBe0788C421886AEB5297789",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x7D16773eA3A8312BCbAf6FB099fd49D74f370891",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x42eE4062C6fBD4C454dC3890D71980b320EE8040",
          "abi": strategyAbiSpirit
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/ETH/0x5Cc61A78F164885776AA610fb0FE1257df78E59B",
        "deprecated": false
      },
      {
        "pid": 27,
        "name": "BUSD-FUSDT Spirit Crypt",
        "symbol": "rfBUSDFUSDT",
        "tokens": [coins.BUSD.name, coins.fUSDT.name],
        "addresses": [coins.BUSD.address, coins.fUSDT.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x1Ac51904cFAaD15679B3500F0fC41D2971657f80",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x1f04fba04344C451E44f005A506909DB051Ae494",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xC5312Cc64Fba7F405A41Efa394Bd5983d46Dbf9A",
          "abi": strategyAbiSpirit
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/0x049d68029688eAbF473097a2fC38ef61633A3C7A/0xC931f61B1534EB21D8c11B24f3f5Ab2471d4aB50",
        "fantomPairing": true,
        "deprecated": false
      },
      {
        "pid": 25,
        "name": "SPIRIT-DAI Spirit Crypt",
        "symbol": "rfSPIRITDAI",
        "tokens": [coins.SPIRIT.name, coins.DAI.name],
        "addresses": [coins.SPIRIT.address, coins.DAI.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xfFbfc0446cA725b21256461e214E9D472f9be390",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x6bd2a9DA72395661897F6a3F1c09075C5A2EE906",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x6e7a6ad7621842704986CbAd3f38aB49c0C4eB27",
          "abi": strategyAbiSpirit
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/0x5Cc61A78F164885776AA610fb0FE1257df78E59B/0x8D11eC38a3EB5E956B052f67Da8Bdc9bef8Abf3E",
        "fantomPairing": true,
        "deprecated": false
      },
      {
        "pid": 2,
        "name": "FTM-BTC Spirit Crypt",
        "symbol": "rfFTMBTC",
        "tokens": [coins.FTM.name, coins.WBTC.name],
        "addresses": [coins.FTM.address, coins.WBTC.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x279b2c897737a50405ED2091694F225D83F2D3bA",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xBA47134f0eb0b1DFf4F1117205f788c561351Ef4",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xDcBCB13B6171c27Bb28718f652d0deeCC2e3CA71",
          "abi": strategyAbiSpirit
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/ETH/0x321162Cd933E2Be498Cd2267a90534A804051b11",
        "deprecated": false
      },
      {
        "pid": 3,
        "name": "FTM-ETH Spirit Crypt",
        "symbol": "rfFTMETH",
        "tokens": [coins.FTM.name, coins.WETH.name],
        "addresses": [coins.FTM.address, coins.WETH.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x613BF4E46b4817015c01c6Bb31C7ae9edAadc26e",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x5D3d1529b4c31E63C3Ed282CaBD2aF5088d1F98e",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x3dc9781783D9fDAe57350482Ccc7A5591FcFD2Da",
          "abi": strategyAbiSpirit
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/ETH/0x74b23882a30290451A17c44f4F05243b6b58C76d",
        "deprecated": false
      },
      {
        "pid": 4,
        "name": "FTM-USDC Spirit Crypt",
        "symbol": "rfFTMUSDC",
        "tokens": [coins.FTM.name, coins.USDC.name],
        "addresses": [coins.FTM.address, coins.USDC.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xe7E90f5a767406efF87Fdad7EB07ef407922EC1D",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x1eA2B476F2669c47937d2d5D64Ef92E59DE9D002",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xe36fBc540af0799cC516711Df80a77261b8b3AFd",
          "abi": strategyAbiSpirit
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/ETH/0x04068DA6C83AFCFA0e13ba15A6696662335D5B75",
        "deprecated": false
      },
      {
        "pid": 5,
        "name": "FTM-fUSD Spirit Crypt",
        "symbol": "rfFTMFUSD",
        "tokens": [coins.FTM.name, coins.fUSD.name],
        "addresses": [coins.FTM.address, coins.fUSD.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xBaf1B2fD16f7294ca158B3F1065e5f27F9c72b61",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x0000000000000000000000000000000000000000",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x0000000000000000000000000000000000000000",
          "abi": strategyAbiSpirit
        },
        "deprecated": true
      },
      {
        "pid": 6,
        "name": "FTM-ZOO Spirit Crypt",
        "symbol": "rfFTMZOO",
        "tokens": [coins.FTM.name, coins.ZOO.name],
        "addresses": [coins.FTM.address, coins.ZOO.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xDF18DD2631f02D930071DF7d6FF89bbc3718C62F",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x88e325103c7ADBAe844995Ce639cE2Ec075d51c3",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xD40A78dCD08DC976031C50EeA462b5E2BBA1b470",
          "abi": strategyAbiSpirit
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/ETH/0x09e145A1D53c0045F41aEEf25D8ff982ae74dD56",
        "deprecated": false
      },
      {
        "pid": 7,
        "name": "FTM-ICE Spirit Crypt",
        "symbol": "rfFTMICE",
        "tokens": [coins.FTM.name, coins.ICE.name],
        "addresses": [coins.FTM.address, coins.ICE.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x936D23C83c2469f6a14B9f5bEaec13879598A5aC",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x2425BE5F64ed3CbcC0731886058C675eE62e88ed",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x3756497D7eE73b5dd1eB7A6bB43d4CBbC23f3Bbb",
          "abi": strategyAbiSpirit
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/ETH/0xf16e81dce15B08F326220742020379B855B87DF9",
        "deprecated": false
      },
      {
        "pid": 8,
        "name": "FTM-SUSHI Spirit Crypt",
        "symbol": "rfFTMSUSHI",
        "tokens": [coins.FTM.name, coins.SUSHI.name],
        "addresses": [coins.FTM.address, coins.SUSHI.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x9Fe4c0CE5F533e96C2b72d852f190961AD5a7bB3",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x6e7CeB988f63FAC007Fd9135e06db8C785f1E5a9",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x36c72e570913084FB3814aDa4Cf10fA14D57B2Ab",
          "abi": strategyAbiSpirit
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/ETH/0xae75A438b2E0cB8Bb01Ec1E1e376De11D44477CC",
        "deprecated": false
      },
      {
        "pid": 9,
        "name": "FTM-CREAM Spirit Crypt",
        "symbol": "rfFTMCREAM",
        "tokens": [coins.FTM.name, coins.CREAM.name],
        "addresses": [coins.FTM.address, coins.CREAM.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x040dd0d0f5e2a01fEb0C5457AbB588B23Cf4c43a",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xd8e18a8621F970AF43053135E3f599fc4c2ECCED",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x50a97B66EdC4984c05a43ad883a7623f8aa82940",
          "abi": strategyAbiSpirit
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/ETH/0x657A1861c15A3deD9AF0B6799a195a249ebdCbc6",
        "deprecated": false
      },
      {
        "pid": 10,
        "name": "FTM-CURVE Spirit Crypt",
        "symbol": "rfFTMCRV",
        "tokens": [coins.FTM.name, coins.CRV.name],
        "addresses": [coins.FTM.address, coins.CRV.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x374C8ACb146407Ef0AE8F82BaAFcF8f4EC1708CF",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xF4b1115712a265Aab7C75d5717451b314F78d42F",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x9A66aEdFB1EAe20188747878E66D18ce6a412a23",
          "abi": strategyAbiSpirit
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/ETH/0x1E4F97b9f9F913c46F1632781732927B9019C68b",
        "deprecated": false
      },
      {
        "pid": 11,
        "name": "FTM-LINK Spirit Crypt",
        "symbol": "rfFTMLINK",
        "tokens": [coins.FTM.name, coins.LINK.name],
        "addresses": [coins.FTM.address, coins.LINK.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xd061c6586670792331E14a80f3b3Bb267189C681",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xe0cD38B7c566A48eaac11B8af63Ab22E891D7d27",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x7BEE3Db0E920E34972bC36Cc9488D33A77f687D5",
          "abi": strategyAbiSpirit
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/ETH/0xb3654dc3D10Ea7645f8319668E8F54d2574FBdC8",
        "deprecated": false
      },
      {
        "pid": 12,
        "name": "FTM-COVER Spirit Crypt",
        "symbol": "rfFTMCOVER",
        "tokens": [coins.FTM.name, coins.COVER.name],
        "addresses": [coins.FTM.address, coins.COVER.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x5427E7AB61145c41b1e58453121245dAEF3929C3",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x2fa23B1eCea02db32F4875Ae204606c4c4620cD0",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xB3E59AcA13A2f3dde9A6716639381F0F42FF5c69",
          "abi": strategyAbiSpirit
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/ETH/0xB01E8419d842beebf1b70A7b5f7142abbaf7159D",
        "deprecated": false
      },
      {
        "pid": 13,
        "name": "FTM-YFI Spirit Crypt",
        "symbol": "rfFTMYFI",
        "tokens": [coins.FTM.name, coins.YFI.name],
        "addresses": [coins.FTM.address, coins.YFI.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x4fc38a2735C7da1d71ccAbf6DeC235a7DA4Ec52C",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xc627BbFC991Be4A4852cED481e47B425494ba99C",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xD0a5Db0a2e8fB17278A1F954b095C5A37928175F",
          "abi": strategyAbiSpirit
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/ETH/0x29b0Da86e484E1C0029B56e817912d778aC0EC69",
        "deprecated": false
      },
      {
        "pid": 14,
        "name": "FTM-FRAX Spirit Crypt",
        "symbol": "rfFTMFRAX",
        "tokens": [coins.FTM.name, coins.FRAX.name],
        "addresses": [coins.FTM.address, coins.FRAX.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x0eC0E1629E776272FA3E55548D4A656BE0EEdcF4",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x68565c0ff26b082539Aac476d96aDD93644Ef989",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xd83e20a99685b45831D308f7Cc65306FBC3ef436",
          "abi": strategyAbiSpirit
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/ETH/0xaf319E5789945197e365E7f7fbFc56B130523B33",
        "deprecated": false
      },
      {
        "pid": 15,
        "name": "FTM-BEAN Spirit Crypt",
        "symbol": "rfFTMBEAN",
        "tokens": [coins.FTM.name, coins.BEAN.name],
        "addresses": [coins.FTM.address, coins.BEAN.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xF78d8D124DF289e8dd2725584f008AE2C6d27A96",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x63F752af5CA6dF8F709DA80fD3F4896da5f4fde8",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x0eBEc5e086EAD126a17ED5cFA9838197E77AF145",
          "abi": strategyAbiSpirit
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/ETH/0xbAc5d43A56696e5D0CB631609E85798f564b513b",
        "deprecated": true
      },
      {
        "pid": 16,
        "name": "FRAX-FXS Spirit Crypt",
        "symbol": "rfFRAXFXS",
        "tokens": [coins.FRAX.name, coins.FXS.name],
        "addresses": [coins.FTM.address, coins.FXS.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x100FcF27C87D1cc7b8D6c28b69b84A359e4fd377",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x170ECd93e6DaF338253d5a9cA67a4C0E898BB082",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x3B2009d4e7BA2bfd593984812251f971e5d0B9EB",
          "abi": strategyAbiSpirit
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/0xaf319E5789945197e365E7f7fbFc56B130523B33/0x82F8Cb20c14F134fe6Ebf7aC3B903B2117aAfa62",
        "deprecated": false
      },
      {
        "pid": 17,
        "name": "FTM-fUSDT Spirit Crypt",
        "symbol": "rfFTMFUSDT",
        "tokens": [coins.FTM.name, coins.fUSDT.name],
        "addresses": [coins.FTM.address, coins.fUSDT.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xd14Dd3c56D9bc306322d4cEa0E1C49e9dDf045D4",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xbC43B27443D97Afa9eB048E8E857DEcC7274A257",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xC4c1137f5D8Adc8150b52BF0a0754aD256b6ab2a",
          "abi": strategyAbiSpirit
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/ETH/0x049d68029688eAbF473097a2fC38ef61633A3C7A",
        "deprecated": false
      },
      {
        "pid": 18,
        "name": "FTM-ANY Spirit Crypt",
        "symbol": "rfFTMANY",
        "tokens": [coins.FTM.name, coins.ANY.name],
        "addresses": [coins.FTM.address, coins.ANY.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x26D583028989378Cc1b7CBC023f4Ae049d5e5899",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xB60Ef4F4DeBBF3Ef073e766bff5195E070f4EC2e",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x65e87E31E99Ad889a806a665fc3Ff622B7b85a59",
          "abi": strategyAbiSpirit
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/ETH/0x049d68029688eAbF473097a2fC38ef61633A3C7A",
        "deprecated": false
      },
      {
        "pid": 19,
        "name": "SPIRIT-BEAN Spirit Crypt",
        "symbol": "rfBEANSPIRIT",
        "tokens": [coins.SPIRIT.name, coins.BEAN.name],
        "addresses": [coins.SPIRIT.address, coins.BEAN.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xa7d46F64875a82461058806B784AfB8F33c7Ea7C",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xD74bbb0761f838366c6169Af2F835b4A62038894",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x5200A61F67A60B2A6305C5D9d09D9B3A9387d74D",
          "abi": strategyAbiSpirit
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/0xbAc5d43A56696e5D0CB631609E85798f564b513b/0x5Cc61A78F164885776AA610fb0FE1257df78E59B",
        "deprecated": false
      },
      {
        "pid": 20,
        "name": "SPIRIT-CZTEARS Spirit Crypt",
        "symbol": "rfSPIRITCZTEARS",
        "tokens": [coins.SPIRIT.name, coins.CZTEARS.name],
        "addresses": [coins.SPIRIT.address, coins.CZTEARS.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xC66c0F0318e2777A53F884C8874B6CA3c2ED8f84",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x1753277FccCD9E29Caa48738A6715490c0D710e3",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x0A52Faf05a5a0a3f1Ef9C2200c31114220e5BcED",
          "abi": strategyAbiSpirit
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/0x907f1A48918Bb5DE07c12443CAB0e6EEfCC611BC/0x5Cc61A78F164885776AA610fb0FE1257df78E59B",
        "deprecated": false
      },
      {
        "pid": 21,
        "name": "FTM-BNB Spirit Crypt",
        "symbol": "rfFTMBNB",
        "tokens": [coins.FTM.name, coins.BNB.name],
        "addresses": [coins.FTM.address, coins.BNB.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x74fE5Ddc4c27F91a1898ccd5Ac62dFeb2d3dF726",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x89258E367aE8a66CB276Fa8b98Cb3743B7cD853e",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x10E677f11E63f4A8A47168eD16FEb8B6651C2F60",
          "abi": strategyAbiSpirit
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/FTM/0xD67de0e0a0Fd7b15dC8348Bb9BE742F3c5850454",
        "deprecated": false
      },
      {
        "pid": 22,
        "name": "SPIRIT-BNB Spirit Crypt",
        "symbol": "rfSPIRITBNB",
        "tokens": [coins.SPIRIT.name, coins.BNB.name],
        "addresses": [coins.SPIRIT.address, coins.BNB.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x9D103Bc85A33B007B58bE2fDee3e1A64651f676d",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x9a92D53a923C75CC388Ea27D71F93Fb0b0797Fb1",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xBc23fCE02F409Bed3BfB67b1F63374954fc9768C",
          "abi": strategyAbiSpirit
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/0xD67de0e0a0Fd7b15dC8348Bb9BE742F3c5850454/0x5Cc61A78F164885776AA610fb0FE1257df78E59B",
        "fantomPairing": true,
        "deprecated": false
      },
      {
        "pid": 23,
        "name": "YFI-WOOFY Spirit Crypt",
        "symbol": "rfYFIWOOFY",
        "tokens": [coins.YFI.name, coins.WOOFY.name],
        "addresses": [coins.YFI.address, coins.WOOFY.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x287ebF376c59a037B8D8E0e987461b2fd8550D8c",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xF508E956b07486De4588880B602B3f02AdFc6941",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x61FefdC82aCA572F4B918791F1C4305Fe4D9696a",
          "abi": strategyAbiSpirit
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/0x29b0Da86e484E1C0029B56e817912d778aC0EC69/0xD0660cD418a64a1d44E9214ad8e459324D8157f1",
        "fantomPairing": true,
        "deprecated": false
      },
      {
        "pid": 24,
        "name": "FTM-SUPRA Spirit Crypt",
        "symbol": "rfFTMBNB",
        "lpToken": {
          "address": ""
        },
        "vault": {
          "address": ""
        },
        "strategy": {
          "address": ""
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/FTM/0xD67de0e0a0Fd7b15dC8348Bb9BE742F3c5850454",
        "fantomPairing": true,
        "deprecated": true
      },
    ]
  },
  "liquid": {
    "masterChef": "0x742474dAE70Fa2AB063aB786b1fBe5704e861a0c",
    "uniRouter": "0x1b02dA8Cb0d097eB8D57A175b88c7D8b47997506",
    "rewardToken": "0x10b620b2dbac4faa7d7ffd71da486f5d44cd86f9",
    "emissionMultiplier": "1",
    "farms": [
      {
        "pid": 17,
        "name": "LQDR-fUSDT Liquid Crypt",
        "symbol": "rfLQDRFUSDT",
        "tokens": [coins.LQDR.name, coins.fUSDT.name],
        "addresses": [coins.LQDR.address, coins.fUSDT.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xA1BB6830fAbdDB99Ed365C0611a33741c5e6173f",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x9282818EAA61fF6ead1aDAEea0361c657277BF54",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x6C762a69527d2cee2aeef5F64574808f4277740E",
          "abi": strategyAbiLiquid
        },
        "addLiquidity": "https://app.sushi.com/add/0x10b620b2dbAC4Faa7D7FFD71Da486f5D44cd86f9/0x049d68029688eAbF473097a2fC38ef61633A3C7A",
        "deprecated": false
      },
      {
        "pid": 18,
        "name": "FTM-LQDR Liquid Crypt",
        "symbol": "rfFTMLQDR",
        "tokens": [coins.FTM.name, coins.LQDR.name],
        "addresses": [coins.FTM.address, coins.LQDR.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xfA7cA6E6D17368e0a1fA9C75f2eBE5A8d7bE9fc6",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x9fE9f8f3fc4410Dc762cD87E27054D6710998764",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x400528CBb7b4C7597eeeCA9Eb8132916eEeB5914",
          "abi": strategyAbiLiquid
        },
        "addLiquidity": "https://app.sushi.com/add/ETH/0x10b620b2dbAC4Faa7D7FFD71Da486f5D44cd86f9",
        "deprecated": false
      },
      {
        "pid": 19,
        "name": "LQDR Single Liquid Crypt",
        "symbol": "rfLQDR",
        "tokens": [coins.LQDR.name],
        "addresses": [coins.LQDR.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x10b620b2dbAC4Faa7D7FFD71Da486f5D44cd86f9",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "",
          "abi": strategyAbiLiquid
        },
        "addLiquidity": "https://app.sushi.com/swap?inputCurrency=ETH&outputCurrency=0x10b620b2dbAC4Faa7D7FFD71Da486f5D44cd86f9",
        "deprecated": true
      },
      {
        "pid": 0,
        "name": "FTM-YFI Liquid Crypt",
        "symbol": "rfFTMYFI",
        "tokens": [coins.FTM.name, coins.YFI.name],
        "addresses": [coins.FTM.address, coins.YFI.address],
        "fees": {"depositFee": liquidDepFee, "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x280AbC0D9727f4DE3A46Ca9CF93C16b4a9c127D1",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x3168676e310A3dc426379108d277e0Ba861dBAd3",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xFbfE2a1CC0A08b3c1D1E78Dde870F066A7E7B4a0",
          "abi": strategyAbiLiquid
        },
        "addLiquidity": "https://app.sushi.com/add/ETH/0x29b0Da86e484E1C0029B56e817912d778aC0EC69",
        "deprecated": false
      },
      {
        "pid": 1,
        "name": "FTM-DAI Liquid Crypt",
        "symbol": "rfFTMDAI",
        "tokens": [coins.FTM.name, coins.DAI.name],
        "addresses": [coins.FTM.address, coins.DAI.address],
        "fees": {"depositFee": liquidDepFee, "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xd32F2EB49E91aA160946f3538564118388d6246a",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xeF096a45F6680E51340757d0527Cb74Dea6B26C2",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x1eA8F2E1A7794061137c6FF0bbd3c9B850DEb0F9",
          "abi": strategyAbiLiquid
        },
        "addLiquidity": "https://app.sushi.com/add/ETH/0x8D11eC38a3EB5E956B052f67Da8Bdc9bef8Abf3E",
        "deprecated": false
      },
      {
        "pid": 2,
        "name": "FTM-LINK Liquid Crypt",
        "symbol": "rfFTMLINK",
        "tokens": [coins.FTM.name, coins.LINK.name],
        "addresses": [coins.FTM.address, coins.LINK.address],
        "fees": {"depositFee": liquidDepFee, "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x1Ca86e57103564F47fFCea7259a6ce8Cc1301549",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x514F0822C8a89c5dC483efD46Ee5f37C59bA23fc",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x7C4Ad3587022fEa1dce7a594653091AAf0e6A6e6",
          "abi": strategyAbiLiquid
        },
        "addLiquidity": "https://app.sushi.com/add/ETH/0xb3654dc3D10Ea7645f8319668E8F54d2574FBdC8",
        "deprecated": false
      },
      {
        "pid": 3,
        "name": "FTM-ETH Liquid Crypt",
        "symbol": "rfFTMETH",
        "tokens": [coins.FTM.name, coins.WETH.name],
        "addresses": [coins.FTM.address, coins.WETH.address],
        "fees": {"depositFee": liquidDepFee, "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x3d0BD54c48C2C433ea6fed609Cc3d5Fb7A77622B",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x1Af1D420350f6F49E0D735085C57EDC031B66d04",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x2767aAAf71fd92C6d07D49B07E352483f4ADb8e9",
          "abi": strategyAbiLiquid
        },
        "addLiquidity": "https://app.sushi.com/add/ETH/0x74b23882a30290451A17c44f4F05243b6b58C76d",
        "deprecated": false
      },
      {
        "pid": 4,
        "name": "FTM-fUSDT Liquid Crypt",
        "symbol": "rfFTMFUSDT",
        "tokens": [coins.FTM.name, coins.fUSDT.name],
        "addresses": [coins.FTM.address, coins.fUSDT.address],
        "fees": {"depositFee": liquidDepFee, "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xd019dd7C760c6431797d6ed170bFFb8FAee11F99",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x0a364A13Cf90194A97133f06F53F71344efBE1cd",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x652BCaBe8aa3dB5798742E3A943F7d6dF16b6534",
          "abi": strategyAbiLiquid
        },
        "addLiquidity": "https://app.sushi.com/add/ETH/0x049d68029688eAbF473097a2fC38ef61633A3C7A",
        "deprecated": false
      },
      {
        "pid": 5,
        "name": "FTM-BTC Liquid Crypt",
        "symbol": "rfFTMBTC",
        "tokens": [coins.FTM.name, coins.WBTC.name],
        "addresses": [coins.FTM.address, coins.WBTC.address],
        "fees": {"depositFee": liquidDepFee, "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xC92D97416328A461BcE2F539498b505c6c97748f",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xc5BA511ea2059454236ee17c8C09d6Ec1CBdd777",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xb881BA1091B1683b3a86e4aFDF5CdF8021e29E7F",
          "abi": strategyAbiLiquid
        },
        "addLiquidity": "https://app.sushi.com/add/ETH/0x321162Cd933E2Be498Cd2267a90534A804051b11",
        "deprecated": false
      },
      {
        "pid": 6,
        "name": "FTM-SUSHI Liquid Crypt",
        "symbol": "rfFTMSUSHI",
        "tokens": [coins.FTM.name, coins.SUSHI.name],
        "addresses": [coins.FTM.address, coins.SUSHI.address],
        "fees": {"depositFee": liquidDepFee, "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x49D2e0DC99C7358D7A9A8633Bf6df111D0EE7F65",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xd6A7A673Bf04a6a98029dE6654a1A966D5275fFd",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xDA68eD4DeB12FA270823380a1b31ffC88D03B8C7",
          "abi": strategyAbiLiquid
        },
        "addLiquidity": "https://app.sushi.com/add/ETH/0xae75A438b2E0cB8Bb01Ec1E1e376De11D44477CC",
        "deprecated": false
      },
      {
        "pid": 7,
        "name": "FTM-CREAM Liquid Crypt",
        "symbol": "rfFTMCREAM",
        "tokens": [coins.FTM.name, coins.CREAM.name],
        "addresses": [coins.FTM.address, coins.CREAM.address],
        "fees": {"depositFee": liquidDepFee, "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x147e27BE8E66f74c7659d88E2e6a13188873D58b",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xA9052F3571cDdbCe0Ccd624aD32DA9978c44a31F",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x45B56B2329c8a12e5cC517e9D944d95b26C40deB",
          "abi": strategyAbiLiquid
        },
        "addLiquidity": "https://app.sushi.com/add/ETH/0x657A1861c15A3deD9AF0B6799a195a249ebdCbc6",
        "deprecated": false
      },
      {
        "pid": 8,
        "name": "FRAX-FXS Liquid Crypt",
        "symbol": "rfFRAXFXS",
        "tokens": [coins.FRAX.name, coins.FXS.name],
        "addresses": [coins.FRAX.address, coins.FXS.address],
        "fees": {"depositFee": liquidDepFee, "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xCFF4353E10A7207Bd16427CA9549437d439b68Df",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x24965A796dEe908fCB3f03ff6Db01bCE2B0c9d5F",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xc171875D534550696d3E76EcF650f63088c3ad85",
          "abi": strategyAbiLiquid
        },
        "addLiquidity": "https://app.sushi.com/add/0xaf319E5789945197e365E7f7fbFc56B130523B33/0x82F8Cb20c14F134fe6Ebf7aC3B903B2117aAfa62",
        "deprecated": true
      },
      {
        "pid": 9,
        "name": "AAVE-USDC LIQUID CRYPT",
        "symbol": "rfAAVEUSDC",
        "tokens": [coins.AAVE.name, coins.USDC.name],
        "addresses": [coins.AAVE.address, coins.USDC.address],
        "fees": {"depositFee": liquidDepFee, "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x2d89BB3b1448152002453AA37fbE4051AfdBf56d",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xbabF6eEfcb621ef2b542b36a2B2d944D8Ab626DD",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x6349c5811fb4B1b7eE83972cCa1945B064BDa0EE",
          "abi": strategyAbiLiquid
        },
        "addLiquidity": "https://app.sushi.com/add/0x6a07A792ab2965C72a5B8088d3a069A7aC3a993B/0x04068DA6C83AFCFA0e13ba15A6696662335D5B75",
        "deprecated": false,
      },
      {
        "pid": 10,
        "name": "FTM-SNX Liquid Crypt",
        "symbol": "rfFTMSNX",
        "tokens": [coins.FTM.name, coins.SNX.name],
        "addresses": [coins.FTM.address, coins.SNX.address],
        "fees": {"depositFee": liquidDepFee, "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xFe69403CF2e22390c0D87aB05062F67D9084935B",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xD5fA38E9c0e9e1583E81Ffd36EF02d6437007E06",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xbcd3043D0B7Fe0931a931af57A89511AB7A20401",
          "abi": strategyAbiLiquid
        },
        "addLiquidity": "https://app.sushi.com/add/0x56ee926bD8c72B2d5fa1aF4d9E4Cbb515a1E3Adc/ETH",
        "deprecated": false
      },
      {
        "pid": 11,
        "name": "FTM-ICE Liquid Crypt",
        "symbol": "rfFTMICE",
        "tokens": [coins.FTM.name, coins.ICE.name],
        "addresses": [coins.FTM.address, coins.ICE.address],
        "fees": {"depositFee": liquidDepFee, "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x84311ECC54D7553378c067282940b0fdfb913675",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xEf3127CC36a02117957CFeeBB0337bF37be3A44a",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x9EE4e27cED4bB5134A2FbDBd8a13fDA1411A9B05",
          "abi": strategyAbiLiquid
        },
        "addLiquidity": "https://app.sushi.com/add/ETH/0xf16e81dce15B08F326220742020379B855B87DF9",
        "deprecated": false
      },
      {
        "pid": 12,
        "name": "FTM-COVER Liquid Crypt",
        "symbol": "rfFTMCOVER",
        "tokens": [coins.FTM.name, coins.COVER.name],
        "addresses": [coins.FTM.address, coins.COVER.address],
        "fees": {"depositFee": liquidDepFee, "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xAFa1BF9b2a89DFD60499838c331538283b3346ED",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x6256E6aF91886912Bbc78BfAeDc7ab64A2865871",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x0146ee4158736957714A48f8805BDf5ca924e426",
          "abi": strategyAbiLiquid
        },
        "addLiquidity": "https://app.sushi.com/add/ETH/0xB01E8419d842beebf1b70A7b5f7142abbaf7159D",
        "deprecated": false
      },
      {
        "pid": 13,
        "name": "FTM-ZOO Liquid Crypt",
        "symbol": "rfFTMZOO",
        "tokens": [coins.FTM.name, coins.ZOO.name],
        "addresses": [coins.FTM.address, coins.ZOO.address],
        "fees": {"depositFee": liquidDepFee, "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x3Ac28d350C59ef9054B305DFe9078fADc3cecABe",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xe38866641Daa321CE74254CCEbC002cd92437B9b",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xcF37066Be0eDb8b2f0A3a8029Df5be913207616b",
          "abi": strategyAbiLiquid
        },
        "addLiquidity": "https://app.sushi.com/add/ETH/0x09e145A1D53c0045F41aEEf25D8ff982ae74dD56",
        "deprecated": false
      },
      {
        "pid": 14,
        "name": "FTM-SFI Liquid Crypt",
        "symbol": "rfFTMSFI",
        "tokens": [coins.FTM.name, coins.SFI.name],
        "addresses": [coins.FTM.address, coins.SFI.address],
        "fees": {"depositFee": liquidDepFee, "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xC24afba17c981326Aa14238FCB55Abc7d0907808",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "",
          "abi": strategyAbiLiquid
        },
        "addLiquidity": "https://app.sushi.com/add/ETH/0x924828a9Fb17d47D0eb64b57271D10706699Ff11",
        "deprecated": true
      },
      {
        "pid": 15,
        "name": "FTM-CURVE Liquid Crypt",
        "symbol": "rfFTMCURVE",
        "tokens": [coins.FTM.name, coins.CRV.name],
        "addresses": [coins.FTM.address, coins.CRV.address],
        "fees": {"depositFee": liquidDepFee, "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x177e2cc843d2Ee20AA884DC8af2a865adf78adb2",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x6F042983B541ce8773F129E2a53317D81A3b6979",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x17D40E7e7223db8A411852DE7a3cBae1CC304846",
          "abi": strategyAbiLiquid
        },
        "addLiquidity": "https://app.sushi.com/add/ETH/0x1E4F97b9f9F913c46F1632781732927B9019C68b",
        "deprecated": false
      },
      {
        "pid": 16,
        "name": "FRAX-fUSDT Liquid Crypt",
        "symbol": "rfFRAXFUSDT",
        "tokens": [coins.FRAX.name, coins.fUSDT.name],
        "addresses": [coins.FRAX.address, coins.fUSDT.address],
        "fees": {"depositFee": liquidDepFee, "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x4669751cD7933c9Ca2aC8147aE7043d8561f4C8D",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xbB517133Ce2af1845815e9864C99422d14AAb236",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x3f6c2c24b24d837D17B4A91883595F7e6Bf71577",
          "abi": strategyAbiLiquid
        },
        "addLiquidity": "https://app.sushi.com/add/0xaf319E5789945197e365E7f7fbFc56B130523B33/0x049d68029688eAbF473097a2fC38ef61633A3C7A",
        "deprecated": false
      },
    ]
  },
  "popsicle": {
    "masterChef": "0xbf513aCe2AbDc69D38eE847EFFDaa1901808c31c",
    "rewardToken": "0xf16e81dce15b08f326220742020379b855b87df9",
    "emissionMultiplier": "1",
    "farms": [
      {
        "pid": 0,
        "name": "FTM-ICE Sushi Popsicle Crypt",
        "symbol": "rfFTMICE",
        "tokens": [coins.FTM.name, coins.ICE.name],
        "addresses": [coins.FTM.address, coins.ICE.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "exchange": "sushi",
        "lpToken": {
          "address": "0x84311ECC54D7553378c067282940b0fdfb913675",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x7170e41Fca6388e50544290A70A73AcB2697f27E",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x2DF7339d5f82E1E585AC6b17251187DDe570Ed15",
          "abi": strategyAbiIceSushi
        },
        "addLiquidity": "https://app.sushi.com/add/ETH/0xf16e81dce15B08F326220742020379B855B87DF9",
        "deprecated": false
      },
      {
        "pid": 1,
        "name": "FTM-ICE Spooky Popsicle Crypt",
        "symbol": "rfICEFTM",
        "tokens": [coins.FTM.name, coins.ICE.name],
        "addresses": [coins.FTM.address, coins.ICE.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "exchange": "spooky",
        "lpToken": {
          "address": "0x623EE4a7F290d11C11315994dB70FB148b13021d",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xe3165402205EE383A171cb20cEa1229b4DE05C80",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x050e18dC8B88c2bEE3788Ba384032A12F66AD5d8",
          "abi": strategyAbiIceSpooky
        },
        "addLiquidity": "https://spookyswap.finance/add/FTM/0xf16e81dce15B08F326220742020379B855B87DF9",
        "deprecated": false
      }
    ]
  },
  "waka": {
    "masterChef": "0xaEF349E1736b8A4B1B243A369106293c3a0b9D09",
    "uniRouter": "0x7B17021FcB7Bc888641dC3bEdfEd3734fCaf2c87",
    "rewardToken": "0xf61cCdE1D4bB76CeD1dAa9D4c429cCA83022B08B",
    "emissionMultiplier": "1",
    "farms": [
      {
        "pid": 0,
        "name": "FTM-WAKA Waka Crypt",
        "symbol": "rfFTMWAKA",
        "tokens": [coins.FTM.name, coins.WAKA.name],
        "addresses": [coins.FTM.address, coins.WAKA.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x696885e9581bd33eE9877Bd8750DdDA65381FF01",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x1FdE23461662a23Bc753b9f2739b42410701d064",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x60E63c1AE57CA40976fCf597D86D734141f34b5E",
          "abi": strategyAbiWaka
        },
        "addLiquidity": "https://waka.finance/#/liquidity",
        "deprecated": false
      },
      {
        "pid": 1,
        "name": "FTM-fUSDT Waka Crypt",
        "symbol": "rfFTMFUSDT",
        "tokens": [coins.FTM.name, coins.fUSDT.name],
        "addresses": [coins.FTM.address, coins.fUSDT.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x68a242300E9547263aA8d57C1E4A7D75CF3c8e5f",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x3673fA95CFF65c6F2e9324C063376CDAf0903c8B",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xd6D9e04eB60e60BC8954453E33Cf9Ad5aa470755",
          "abi": strategyAbiWaka
        },
        "addLiquidity": "https://waka.finance/#/liquidity",
        "deprecated": false
      },
      {
        "pid": 2,
        "name": "FTM-USDC Waka Crypt",
        "symbol": "rfFTMUSDC",
        "tokens": [coins.FTM.name, coins.USDC.name],
        "addresses": [coins.FTM.address, coins.USDC.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x97a490E7c90b4d8F6d18752672F4c8E3C35891A2",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x19383c6e3dFd5Da571Afb6D03600a26dB246bF21",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x615F3A0c551b2a33eE26b987DaEc8721AD8dB987",
          "abi": strategyAbiWaka
        },
        "addLiquidity": "https://waka.finance/#/liquidity",
        "deprecated": false
      },
      {
        "pid": 3,
        "name": "FTM-BTC Waka Crypt",
        "symbol": "rfFTMBTC",
        "tokens": [coins.FTM.name, coins.WBTC.name],
        "addresses": [coins.FTM.address, coins.WBTC.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x195C45044B121D8CAF4C9e2d8F47fb81f4E12f21",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x40906eCe66A2d44b23FfCE98B848945d4bBD741A",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x4801748103C5AE1a2044235134e706F6fa507550",
          "abi": strategyAbiWaka
        },
        "addLiquidity": "https://waka.finance/#/liquidity",
        "deprecated": false
      },
      {
        "pid": 4,
        "name": "FTM-ETH Waka Crypt",
        "symbol": "rfFTMETH",
        "tokens": [coins.FTM.name, coins.WETH.name],
        "addresses": [coins.FTM.address, coins.WETH.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x0eEA1bf6342C71171882c2aC3838A9C78e00B5CB",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x4987AbFACE73C78bA7435eC16743c541CF1Ef660",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x7607b8B2bDF8Ddde192493b989C35D1f7D2E1a4f",
          "abi": strategyAbiWaka
        },
        "addLiquidity": "https://waka.finance/#/liquidity",
        "deprecated": false
      },
      {
        "pid": 5,
        "name": "FTM-ATARI Waka Crypt",
        "symbol": "rfFTMATRI",
        "tokens": [coins.FTM.name, coins.ATRI.name],
        "addresses": [coins.FTM.address, coins.ATRI.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x0370dC24570ED93DB0b67d20340923E56c0aADD9",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x38092Fce723d999D592877B48a6F198e9DE8DE53",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x2C0c19CDe1C2B973E3cb4Fe77F7F58943d706EBc",
          "abi": strategyAbiWaka
        },
        "addLiquidity": "https://waka.finance/#/liquidity",
        "deprecated": false
      },
      {
        "pid": 6,
        "name": "FTM-DAI Waka Crypt",
        "symbol": "rfFTMDAI",
        "tokens": [coins.FTM.name, coins.DAI.name],
        "addresses": [coins.FTM.address, coins.DAI.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x78Da2Bd2c18837C9d1B9008C81078E378f1952c6",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x134fBfaE15202721853B620eDcD8E12bc2a3043D",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x5D8fd8E94EAA8154ED97974F033696a7189b776c",
          "abi": strategyAbiWaka
        },
        "addLiquidity": "https://waka.finance/#/liquidity",
        "deprecated": false
      },
      {
        "pid": 7,
        "name": "FTM-YFI Waka Crypt",
        "symbol": "rfFTMYFI",
        "tokens": [coins.FTM.name, coins.YFI.name],
        "addresses": [coins.FTM.address, coins.YFI.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xB0E5d65b4C22FF9f099E449df03acB3A57bb5f27",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x1A57b9D55FC72E7438132B42bEf9E6E72f77ef40",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x6E3D411f11a131aee7fFD1656A5ef7a4EAB53558",
          "abi": strategyAbiWaka
        },
        "addLiquidity": "https://waka.finance/#/liquidity",
        "deprecated": false
      },
      {
        "pid": 8,
        "name": "FTM-SUSHI Waka Crypt",
        "symbol": "rfFTMSUSHI",
        "tokens": [coins.FTM.name, coins.SUSHI.name],
        "addresses": [coins.FTM.address, coins.SUSHI.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x1b084cDA6e11347b3c15EAE537cf8a7ce39f96Da",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x28E3B210a70cdeB22ea7C86ad99878F2d65b75f2",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x3B5f7a4a846A3A431d8680C6eF5A4896578Fd6cC",
          "abi": strategyAbiWaka
        },
        "addLiquidity": "https://waka.finance/#/liquidity",
        "deprecated": false
      },
      {
        "pid": 9,
        "name": "FTM-ZOO Waka CRYPT",
        "symbol": "rfFTMZOO",
        "tokens": [coins.FTM.name, coins.ZOO.name],
        "addresses": [coins.FTM.address, coins.ZOO.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x14643E02C9827FD68465FA2cdeb444DdcB6BA7e2",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x3f7d766dCB25242c64bB21F59F897495d2c549f4",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x6a2049F5D4e53417B45D7F808bBb011B15eecf5c",
          "abi": strategyAbiWaka
        },
        "addLiquidity": "https://waka.finance/#/liquidity",
        "deprecated": false
      },
      {
        "pid": 10,
        "name": "FTM-BADGER Waka Crypt",
        "symbol": "rfSNXFTM",
        "tokens": [coins.FTM.name, coins.BADGER.name],
        "addresses": [coins.FTM.address, coins.BADGER.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x8A400D6bf3cdF070aF6E3312eF4f9681f16A92BD",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xbc2502A4130369B5e116C644751f7E494D4c2748",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xE0234174aE3EF3d49524B322EcE3aDea14dF7d8d",
          "abi": strategyAbiWaka
        },
        "addLiquidity": "https://waka.finance/#/liquidity",
        "deprecated": false
      },
      {
        "pid": 11,
        "name": "FTM-AAVE Waka Crypt",
        "symbol": "rfFTMAAVE",
        "tokens": [coins.FTM.name, coins.AAVE.name],
        "addresses": [coins.FTM.address, coins.AAVE.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x2e783Ce36830a6274761CC4a9d04d275553F3Bc1",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xcb547CFB9E2f6b921928618dFEeaD94fB1782fC9",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x1f7ed379E359AE4C30C90D560edebc06baf8821F",
          "abi": strategyAbiWaka
        },
        "addLiquidity": "https://waka.finance/#/liquidity",
        "deprecated": false
      },
      {
        "pid": 12,
        "name": "FTM-ICE Waka Crypt",
        "symbol": "rfFTMICE",
        "tokens": [coins.FTM.name, coins.ICE.name],
        "addresses": [coins.FTM.address, coins.ICE.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xEF179689B6D242fFC93DFc69241F74D4d391FA7c",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xffadC598DD905958238EFD17DB179CcE7aF6fD89",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xbE165A11B5b9C776132530Bcd3ad6de7Db358b8b",
          "abi": strategyAbiWaka
        },
        "addLiquidity": "https://waka.finance/#/liquidity",
        "deprecated": false
      },
      {
        "pid": 13,
        "name": "FTM-SNX Waka Crypt",
        "symbol": "rfFTMSNX",
        "tokens": [coins.FTM.name, coins.SNX.name],
        "addresses": [coins.FTM.address, coins.SNX.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0xFf09b99aEd8fB58c209904F6Adc4A1fcCeEA79ac",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x5BC25619faDA2e322aB7Dd0F2B9f31ba729DA5af",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x8C2847c1423404ACb4B3597a5e9394A38ABb9e6a",
          "abi": strategyAbiWaka
        },
        "addLiquidity": "https://waka.finance/#/liquidity",
        "deprecated": false
      },
      {
        "pid": 14,
        "name": "FTM-CREAM Waka Crypt",
        "symbol": "rfFTMCREAM",
        "tokens": [coins.FTM.name, coins.CREAM.name],
        "addresses": [coins.FTM.address, coins.CREAM.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x3c4ad49F26B47f00f7E5165b942d41367dD60A04",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xf8B176B6b79eD6B5Aa488Dd012f10AFb5359d80C",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x1aE25DA889A883b3f9330E4aF4b3888d67f56F97",
          "abi": strategyAbiWaka
        },
        "addLiquidity": "https://waka.finance/#/liquidity",
        "deprecated": false
      },
      {
        "pid": 15,
        "name": "FTM-COVER Waka Crypt",
        "symbol": "rfFTMCOVER",
        "tokens": [coins.FTM.name, coins.COVER.name],
        "addresses": [coins.FTM.address, coins.COVER.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x9C58DF352fCd984700C57324A116845378Adc5BA",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xf9eEd794Ff17386721c6488aaBe65a59ed53C120",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x0Aa2B830Ec1C939336d9909De289ca26986c2332",
          "abi": strategyAbiWaka
        },
        "addLiquidity": "https://waka.finance/#/liquidity",
        "deprecated": false
      },
      {
        "pid": 16,
        "name": "FTM-LINK Waka Crypt",
        "symbol": "rfFTMLINK",
        "tokens": [coins.FTM.name, coins.LINK.name],
        "addresses": [coins.FTM.address, coins.LINK.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x32736Ae178d0deBF137326A0C0c6d50e374d9F19",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x7647F9DB71F4A0E52b40101633352d3EDA367c0d",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x45507E59F21C79f17EAb66636ba8044d95FA3437",
          "abi": strategyAbiWaka
        },
        "addLiquidity": "https://waka.finance/#/liquidity",
        "deprecated": false
      },
      {
        "pid": 17,
        "name": "FTM-CURVE Waka Crypt",
        "symbol": "rfFTMCURVE",
        "tokens": [coins.FTM.name, coins.CRV.name],
        "addresses": [coins.FTM.address, coins.CRV.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x3B1B72D6DE14A45096227c3319DD58fCEAE95FaF",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xb8024c7a0B5c2D60C24fB20E27e625681058e3F3",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x6E6Ec7dE9eA7d505397F1Bb6822C238cfA1c882D",
          "abi": strategyAbiWaka
        },
        "addLiquidity": "https://waka.finance/#/liquidity",
        "deprecated": false
      },
      {
        "pid": 18,
        "name": "FTM-BAND Waka Crypt",
        "symbol": "rfFTMBAND",
        "tokens": [coins.FTM.name, coins.BAND.name],
        "addresses": [coins.FTM.address, coins.BAND.address],
        "fees": {"depositFee":"0", "withdrawFee": "0", "interestFee": defaultFee},
        "lpToken": {
          "address": "0x60FF8C1DFFc8252cFD94C07F65fEb4cE90ee9b99",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x78E1BC92C8D9fdfDc5D61e8eEa91c2B31efF48be",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xE9127f5db78C4eD414Effe290D370D21Ce409417",
          "abi": strategyAbiWaka
        },
        "addLiquidity": "https://waka.finance/#/liquidity",
        "deprecated": false
      }
    ]
  },
  "steak": {
    "masterChef": "0x59cC5f5F9309448Fe4a7Bd2dB8eB2DaC0F8fCEA7",
    "rewardToken": "0x05848B832E872d9eDd84AC5718D58f21fD9c9649",
    "emissionMultiplier": "1",
    "farms": [
      {
        "pid": 0,
        "name": "iFUSD",
        "symbol": "rfiFUSD",
        "lpToken": {
          "address": "0xbfaf328fe059c53d936876141f38089df0d1503d"
        },
        "vault": {
          "address": ""
        },
        "strategy": {
          "address": ""
        },
        "addLiquidity": "https://app.sushi.com/add/ETH/0x29b0Da86e484E1C0029B56e817912d778aC0EC69",
        "deprecated": true
      },
      {
        "pid": 1,
        "name": "fUSD-STEAK Steak Crypt",
        "symbol": "rfFUSDSTEAK",
        "tokens": [coins.fUSD.name, coins.STEAK.name],
        "addresses": [coins.fUSD.address, coins.STEAK.address],
        "fees": {"depositFee":"0.005", "withdrawFee": "0", "interestFee": defaultFee},
        "exchange": "spirit",
        "lpToken": {
          "address": "0xcA78e7c058951D1e50eE74B8e9FBb4c9523E9e5A",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x28E1A7Fc0E9Aa9eEd933282FAFbAB1297aa81AB5",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x1Ad4b5B783B92a59ACcF7E3380c7F726799d68B9",
          "abi": strategyAbiSteak
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/0x05848B832E872d9eDd84AC5718D58f21fD9c9649/0xAd84341756Bf337f5a0164515b1f6F993D194E1f",
        "deprecated": false
      },
      {
        "pid": 2,
        "name": "fUSD-USDC Steak Crypt",
        "symbol": "rfMMFTM",
        "tokens": [coins.fUSD.name, coins.USDC.name],
        "addresses": [coins.fUSD.address, coins.USDC.address],
        "fees": {"depositFee":"0.005", "withdrawFee": "0", "interestFee": defaultFee},
        "exchange": "spirit",
        "lpToken": {
          "address": "0x679449a920087828776aeEF4074549410D5c8065",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0xB292e2583276248EECBE240fCe808f0d08d89670",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xbAd215e7c2852466e93Aa9D437226A0238A8C549",
          "abi": strategyAbiSteak
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/0x04068DA6C83AFCFA0e13ba15A6696662335D5B75/0xAd84341756Bf337f5a0164515b1f6F993D194E1f",
        "deprecated": false
      },
      {
        "pid": 3,
        "name": "filler",
        "symbol": "filler",
        "lpToken": {
          "address": "0x98c8cc0E444CE7490926A6C58484B937CF60E117"
        },
        "vault": {
          "address": ""
        },
        "strategy": {
          "address": ""
        },
        "addLiquidity": "https://spookyswap.finance/add/0xbFaf328Fe059c53D936876141f38089df0D1503D/FTM",
        "deprecated": true
      },
      {
        "pid": 4,
        "name": "filler",
        "symbol": "filler",
        "lpToken": {
          "address": "0x0Ec22C6018818ba765A6aB5E8B9C8db0457f967c"
        },
        "vault": {
          "address": ""
        },
        "strategy": {
          "address": ""
        },
        "addLiquidity": "https://spookyswap.finance/add/0xbFaf328Fe059c53D936876141f38089df0D1503D/FTM",
        "deprecated": true
      },
      {
        "pid": 5,
        "name": "FTM-fUSD Steak Crypt",
        "symbol": "rfFTMFUSD",
        "tokens": [coins.FTM.name, coins.fUSD.name],
        "addresses": [coins.FTM.address, coins.fUSD.address],
        "fees": {"depositFee":"0.005", "withdrawFee": "0", "interestFee": defaultFee},
        "exchange": "spirit",
        "lpToken": {
          "address": "0xBaf1B2fD16f7294ca158B3F1065e5f27F9c72b61",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x5746356B2d5F9918645251Ac5A4e9bBaF34fA03D",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0x9E9d9438f8BF835e3E6E82a448420f20FFeF9c3e",
          "abi": strategyAbiSteak
        },
        "addLiquidity": "https://swap.spiritswap.finance/#/add/FTM/0xAd84341756Bf337f5a0164515b1f6F993D194E1f",
        "deprecated": false
      },
      {
        "pid": 6,
        "name": "filler",
        "symbol": "filler",
        "lpToken": {
          "address": "0x74772FBe8ea1b9aD1D750D6334Cdb8C3e227D6ED"
        },
        "vault": {
          "address": ""
        },
        "strategy": {
          "address": ""
        },
        "addLiquidity": "https://spookyswap.finance/add/0xbFaf328Fe059c53D936876141f38089df0D1503D/FTM",
        "deprecated": true
      },
      {
        "pid": 7,
        "name": "filler",
        "symbol": "filler",
        "lpToken": {
          "address": "0xD5FD7B691FCe916E4Fa920f126c2B5Ddb620d019"
        },
        "vault": {
          "address": ""
        },
        "strategy": {
          "address": ""
        },
        "addLiquidity": "https://spookyswap.finance/add/0xbFaf328Fe059c53D936876141f38089df0D1503D/FTM",
        "deprecated": true
      },
      {
        "pid": 8,
        "name": "filler",
        "symbol": "filler",
        "lpToken": {
          "address": "0x91FA829538Ae3678b7EFDeffaf1198e03613d52A"
        },
        "vault": {
          "address": ""
        },
        "strategy": {
          "address": ""
        },
        "addLiquidity": "https://spookyswap.finance/add/0xbFaf328Fe059c53D936876141f38089df0D1503D/FTM",
        "deprecated": true
      },
      {
        "pid": 9,
        "name": "filler",
        "symbol": "filler",
        "lpToken": {
          "address": "0x0bb7Ed20B61b34aE53222f32e4094C1Bba502B16"
        },
        "vault": {
          "address": ""
        },
        "strategy": {
          "address": ""
        },
        "addLiquidity": "https://spookyswap.finance/add/0xbFaf328Fe059c53D936876141f38089df0D1503D/FTM",
        "deprecated": true
      }
    ]
  },
  "tomb": {
    "masterChef": "0xbf513aCe2AbDc69D38eE847EFFDaa1901808c31c",
    "rewardToken": "0x4cdF39285D7Ca8eB3f090fDA0C069ba5F4145B37",
    "farms": [
      {
        "pid": 0,
        "name": "FTM-TOMB Tomb Crypt",
        "symbol": "rfFTMTOMB",
        "tokens": [coins.FTM.name, coins.TOMB.name],
        "addresses": [coins.FTM.address, coins.TOMB.address],
        "fees": {"depositFee":"0.005", "withdrawFee": "0", "interestFee": defaultFee},
        "exchange": "spooky",
        "lpToken": {
          "address": "0x2A651563C9d3Af67aE0388a5c8F89b867038089e",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "",
          "abi": lpTokenAbi
        },
        "strategy": {
          "address": "",
          "abi": strategyAbiSteak
        },
        "addLiquidity": "https://app.sushi.com/add/ETH/0x29b0Da86e484E1C0029B56e817912d778aC0EC69",
        "deprecated": true
      },
      {
        "pid": 1,
        "name": "FTM-TSHARE Tomb Crypt",
        "symbol": "rfFTMTSHARE",
        "tokens": [coins.FTM.name, coins.TSHARE.name],
        "addresses": [coins.FTM.address, coins.TSHARE.address],
        "fees": {"depositFee":"0.005", "withdrawFee": "0", "interestFee": defaultFee},
        "exchange": "spooky",
        "lpToken": {
          "address": "0x4733bc45eF91cF7CcEcaeeDb794727075fB209F2",
          "abi": lpTokenAbi
        },
        "vault": {
          "address": "0x30A9Eb3EC69eD8e68c147B47b9C2E826380024a3",
          "abi": vaultAbi
        },
        "strategy": {
          "address": "0xdD15c64C7cB2FC37059d0adfaB9647DDDc115336",
          "abi": strategyAbiTomb
        },
        "addLiquidity": "https://spookyswap.finance/add/FTM/0x4cdF39285D7Ca8eB3f090fDA0C069ba5F4145B37",
        "deprecated": false
      }
    ]
  }
}

export default vaults;
